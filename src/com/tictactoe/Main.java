package com.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {

	Connect connect = new Connect();

	private int testCount = 0;
	
	TextView text;
	
	private Button serverButton;
	private Button clientButton;
	private Button connectButton;
	private boolean serverSide = false;
	private boolean clientSide = false;
	private EditText serverMsg;
	private EditText clientMsg;
	private EditText serverIp;
	private boolean connected = false;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // remove title bar
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.start);
		text = (TextView) findViewById(R.id.start_text);
		serverButton = (Button) findViewById(R.id.server);
		serverButton.setOnClickListener(serverClick);
		clientButton = (Button) findViewById(R.id.client);
		clientButton.setOnClickListener(clientClick);
    }

	private OnClickListener serverClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			setContentView(R.layout.server);

			text = (TextView) findViewById(R.id.server_status);
//			serverMsg = (EditText) findViewById(R.id.server_msg);
//			serverButton = (Button) findViewById(R.id.server_check);
//			serverButton.setOnClickListener(check);
			
			connect.initServer();
			text.setText("Server initialized, IP: " + connect.getServerIP());
			
			serverSide = true;
		}
	};

	private OnClickListener clientClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
//			clientSide = true;
			setContentView(R.layout.client);

			text = (TextView) findViewById(R.id.client_status);
			serverIp = (EditText) findViewById(R.id.server_ip);
//			connectButton = (Button) findViewById(R.id.connect_phones);
//			connectButton.setOnClickListener(connectClick);

			text.setText("Enter an IP Address to connect to");
		}
	};	
}
