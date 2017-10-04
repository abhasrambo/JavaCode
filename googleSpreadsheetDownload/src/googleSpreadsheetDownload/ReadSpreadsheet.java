package googleSpreadsheetDownload;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.ListEntry;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.util.ServiceException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;


public class ReadSpreadsheet {

    public static final String GOOGLE_ACCOUNT_USERNAME = "abhasroy@gmail.com"; 
    public static final String GOOGLE_ACCOUNT_PASSWORD = "abhas_905005"; 

    public static final String SPREADSHEET_URL = "https://spreadsheets.google.com/feeds/spreadsheets/1FqCRnf6pDHhQnwKC5Bbe-bPmNms2HycSBqPAofaH5ok";



    public static void main(String[] args){
        String status="";

    try{
    /** Our view of Google Spreadsheets as an authenticated Google user. */
        
    	String fileId = "1ZdR3L3qP4Bkq8noWLJHSr_iBau0DNT4Kli4SxNc2YEo";
    	OutputStream outputStream = new ByteArrayOutputStream();
    	driveService.files().export(fileId, "application/pdf")
    	        .executeMediaAndDownloadTo(outputStream);
        // Login and prompt the user to pick a sheet to use.
    	SpreadsheetService service = new SpreadsheetService(fileId);
        service.setUserCredentials(GOOGLE_ACCOUNT_USERNAME,
                GOOGLE_ACCOUNT_PASSWORD);

        // Load sheet
        URL metafeedUrl = new URL(SPREADSHEET_URL);
        SpreadsheetEntry spreadsheet = service.getEntry(metafeedUrl,SpreadsheetEntry.class);
        URL listFeedUrl = spreadsheet.getWorksheets().get(0).getListFeedUrl();

        // Print entries
        ListFeed feed = service.getFeed(listFeedUrl, ListFeed.class);

        for (ListEntry entry : feed.getEntries()) {
            System.out.println("new row");
            for (String tag : entry.getCustomElements().getTags()) {
                System.out.println("     " + tag + ": "
                        + entry.getCustomElements().getValue(tag));
                status=entry.getCustomElements().getValue(tag);

            }
        }

    }catch(Exception e){
        System.out.println(e);
    }
    System.out.println(status);
   
    }
   
    }