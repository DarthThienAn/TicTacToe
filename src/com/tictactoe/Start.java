package com.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends Activity {

	Connect connect = new Connect();

//	private int testCount = 0;
	
	TextView text;
	
	private Button serverButton;
	private Button clientButton;
	private Button connectButton;
	private boolean serverSide = false;
	private boolean clientSide = false;
//	private EditText serverMsg;
//	private EditText clientMsg;
	private EditText serverIp;
	private boolean connected = false;

	private boolean gameStart = false;
	private boolean ready = false;
	private boolean ready2 = false;

	private boolean turn = false;
	private boolean gameover = false;
	
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button checkButton;
	
	private boolean press1 = false;
	private boolean press2 = false;
	private boolean press3 = false;
	private boolean press4 = false;
	private boolean press5 = false;
	private boolean press6 = false;
	private boolean press7 = false;
	private boolean press8 = false;
	private boolean press9 = false;
	private boolean press1x = false;
	private boolean press2x = false;
	private boolean press3x = false;
	private boolean press4x = false;
	private boolean press5x = false;
	private boolean press6x = false;
	private boolean press7x = false;
	private boolean press8x = false;
	private boolean press9x = false;

//	private Handler handler = new Handler();

//	private static final long mDelay = 50;
//	private long mLastMove;
	
	
//	private RefreshHandler mRefreshHandler = new RefreshHandler();
//
//	class RefreshHandler extends Handler {
//
//		@Override
//		public void handleMessage(Message msg) {
//			update();
//		}
//
//		public void sleep(long delayMillis) {
//			this.removeMessages(0);
//			sendMessageDelayed(obtainMessage(0), delayMillis);
//		}
//	};

//	public void update() {
//		Log.d("updating", "." + serverSide);
//		if (gameStart) {
//			long now = System.currentTimeMillis();
//			
//			String input = "";
//
//			if (now - mLastMove > mDelay) {
//				if (serverSide && connect != null)
//				{
//					if((input = connect.getMsgToServer()) != null)
//						test(input);
//				}
//				else if (clientSide && connect != null)
//				{
//					if((input = connect.getMsgToClient()) != null)
//						test(input);
//				}
//
////				if (input == null)
////					input = "null msg";
////					
////				if (serverSide && connect != null)
////				{
////					String input;
////					if ((input = connect.getMsgToServer()) != null)
////					{
////						test(input);
////					}
////				}
////				else if (clientSide && connect != null)
////				{
////					String input;
////					if ((input = connect.getMsgToClient()) != null)
////					{
////						test(input);
////					}
////				}
////				
//
////				handler.post(new Runnable() {
////					@Override
////					public void run() {
////						if (s != null)
////							checkButton.setText(s);
////					}
////				});
////				
////				while (input != null)
////				test(input);
//				
//				if (serverSide && connect != null)
//					connect.sendMsgFromServer(" ");
//				else if (clientSide && connect != null)
//					connect.sendMsgFromClient(" ");
//				
//				mLastMove = now;
//			}
//			mRefreshHandler.sleep(mDelay);
//		}
//	}	
//	
	public void test(String input) {
		if (gameStart)
		{
			if (input != null)
			{
//				button5.setText(input);
				
				if (input.equals("press1"))
				{
					press1x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button1.setText("O");
//							else if (clientSide)
//								button1.setText("X");
//						}
//					});
					if (serverSide)
						button1.setText("O");
					else if (clientSide)
						button1.setText("X");
				}
				if (input.equals("press2"))
				{
					press2x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button2.setText("O");
//							else if (clientSide)
//								button2.setText("X");
//						}
//					});
					if (serverSide)
						button2.setText("O");
					else if (clientSide)
						button2.setText("X");
				}
				if (input.equals("press3"))
				{
					press3x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button3.setText("O");
//							else if (clientSide)
//								button3.setText("X");
//						}
//					});
					if (serverSide)
						button3.setText("O");
					else if (clientSide)
						button3.setText("X");
				}
				if (input.equals("press4"))
				{
					press4x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button4.setText("O");
//							else if (clientSide)
//								button4.setText("X");
//						}
//					});
					if (serverSide)
						button4.setText("O");
					else if (clientSide)
						button4.setText("X");
				}
				if (input.equals("press5"))
				{
					press5x = true;

//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button5.setText("O");
//							else if (clientSide)
//								button5.setText("X");
//						}
//					});

					if (serverSide)
						button5.setText("O");
					else if (clientSide)
						button5.setText("X");
				}
				if (input.equals("press6"))
				{
					press6x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button6.setText("O");
//							else if (clientSide)
//								button6.setText("X");
//						}
//					});
					if (serverSide)
						button6.setText("O");
					else if (clientSide)
						button6.setText("X");
				}
				if (input.equals("press7"))
				{
					press7x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button7.setText("O");
//							else if (clientSide)
//								button7.setText("X");
//						}
//					});
					if (serverSide)
						button7.setText("O");
					else if (clientSide)
						button7.setText("X");
				}
				if (input.equals("press8"))
				{
					press8x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button8.setText("O");
//							else if (clientSide)
//								button8.setText("X");
//						}
//					});
					if (serverSide)
						button8.setText("O");
					else if (clientSide)
						button8.setText("X");
				}
				if (input.equals("press9"))
				{
					press9x = true;
					
//					handler.post(new Runnable() {
//						@Override
//						public void run() {
//							if (serverSide)
//								button9.setText("O");
//							else if (clientSide)
//								button9.setText("X");
//						}
//					});
					if (serverSide)
						button9.setText("O");
					else if (clientSide)
						button9.setText("X");
				}
			}
		}
	}
			
//			if (input == null)
//				Log.d("Error", "Null");
//			else if (input.equals("press1"))
//			{
//				press1x = true;
//				
//				if (serverSide)
//					button1.setText("O");
//				else if (clientSide)
//					button1.setText("X");
//			}
//			else if (input.equals("press2"))
//			{
//				press2x = true;
//				
//				if (serverSide)
//					button2.setText("O");
//				else if (clientSide)
//					button2.setText("X");
//			}
//			else if (input.equals("press3"))
//			{
//				press3x = true;
//				
//				if (serverSide)
//					button3.setText("O");
//				else if (clientSide)
//					button3.setText("X");
//			}
//			else if (input.equals("press4"))
//			{
//				press4x = true;
//				
//				if (serverSide)
//					button4.setText("O");
//				else if (clientSide)
//					button4.setText("X");
//			}
//			else if (input.equals("press5"))
//			{
//				press5x = true;
//				
//				if (serverSide)
//					button5.setText("O");
//				else if (clientSide)
//					button5.setText("X");
//			}
//			else if (input.equals("press6"))
//			{
//				press6x = true;
//				
//				if (serverSide)
//					button6.setText("O");
//				else if (clientSide)
//					button6.setText("X");
//			}
//			else if (input.equals("press7"))
//			{
//				press7x = true;
//				
//				if (serverSide)
//					button7.setText("O");
//				else if (clientSide)
//					button7.setText("X");
//			}
//			else if (input.equals("press8"))
//			{
//				press8x = true;
//				
//				if (serverSide)
//					button8.setText("O");
//				else if (clientSide)
//					button8.setText("X");
//			}
//			else if (input.equals("press9"))
//			{
//				press9x = true;
//				
//				if (serverSide)
//					button9.setText("O");
//				else if (clientSide)
//					button9.setText("X");
//			}
//		}			
//			if (press1 || press1x)
//				button1.setVisibility(View.GONE);
//			if (press2 || press2x)
//				button2.setVisibility(View.GONE);
//			if (press3 || press3x)
//				button3.setVisibility(View.GONE);
//			if (press4 || press4x)
//				button4.setVisibility(View.GONE);
//			if (press5 || press6x)
//				button5.setVisibility(View.GONE);
//			if (press6 || press6x)
//				button6.setVisibility(View.GONE);
//			if (press7 || press7x)
//				button7.setVisibility(View.GONE);
//			if (press8 || press8x)
//				button8.setVisibility(View.GONE);
//			if (press9 || press9x)
//				button9.setVisibility(View.GONE);
//		}
		
//		mRefreshHandler.sleep(1000);
//	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
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
			serverButton = (Button) findViewById(R.id.server_start);
			serverButton.setOnClickListener(check);
			
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
			connectButton = (Button) findViewById(R.id.connect_phones);
			connectButton.setOnClickListener(connectClick);

			text.setText("Enter an IP Address to connect to");
		}
	};	
	

	private OnClickListener connectClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			if (!connected) {
				text.setText("Attempting to connect...");

				String serverIpAddress = serverIp.getText().toString();
				if (!serverIpAddress.equals(""))
				{
					if(connect.initClient(serverIpAddress))
					{
						connected = true;
						setContentView(R.layout.client2);

//						text = (TextView) findViewById(R.id.client2_status);
//						clientMsg = (EditText) findViewById(R.id.client2_msg);

//						text.setText("Client Initialized");
						clientSide = true;
						
						clientButton = (Button) findViewById(R.id.client_start);
						clientButton.setOnClickListener(check);
					}
				}
				else
					text.setText("Client Initialization failed");
			}
		}
	};
	
	private OnClickListener check = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (!ready)
			{
				ready = true;
				
				if (serverSide)
					connect.sendMsgFromServer("ready");
				else if (clientSide)
					connect.sendMsgFromClient("ready");
			}
			
			if (!ready2)
			{
				String input = "";
				
				if (serverSide)
					input = connect.getMsgToServer();
				else if (clientSide)
					input = connect.getMsgToClient();
				
				if (input == null)
					Log.d("Error", "Null");
				else if (input.equals("ready"))
					ready2 = true;
			}
			
			if (ready && ready2 && !gameStart)
			{
				gameStart = true;

				setContentView(R.layout.game2);

				button1 = (Button) findViewById(R.id.button1);
				button1.setOnClickListener(click1);
				button2 = (Button) findViewById(R.id.button2);
				button2.setOnClickListener(click2);
				button3 = (Button) findViewById(R.id.button3);
				button3.setOnClickListener(click3);
				button4 = (Button) findViewById(R.id.button4);
				button4.setOnClickListener(click4);
				button5 = (Button) findViewById(R.id.button5);
				button5.setOnClickListener(click5);
				button6 = (Button) findViewById(R.id.button6);
				button6.setOnClickListener(click6);
				button7 = (Button) findViewById(R.id.button7);
				button7.setOnClickListener(click7);
				button8 = (Button) findViewById(R.id.button8);
				button8.setOnClickListener(click8);
				button9 = (Button) findViewById(R.id.button9);
				button9.setOnClickListener(click9);
				checkButton = (Button) findViewById(R.id.check_button);
				checkButton.setOnClickListener(click10);
				text = (TextView) findViewById(R.id.status);
				
				if(serverSide)
				{
					turn = true;
					text.setText("Game Start. Your move.");
				}
				else
				{
					turn = false;
					text.setText("Game Start. Press check to see if opponent has gone.");
				}
				
//				update();
			}
			
			
//			mRefreshHandler.sleep(1000);
		}
	};

	private OnClickListener click1 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press1 && !press1x && !gameover)
			{
				press1 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press1");
					button1.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press1");
					button1.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button1.setText("X");
//					else if (clientSide)
//						button1.setText("O");
//				}
//			});
			
		}
	};
	
	private OnClickListener click2 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press2 && !press2x && !gameover)
			{
				press2 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press2");
					button2.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press2");
					button2.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}
			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button2.setText("X");
//					else if (clientSide)
//						button2.setText("O");
//				}
//			});
		}
	};
	
	private OnClickListener click3 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press3 && !press3x && !gameover)
			{
				press3 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press3");
					button3.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press3");
					button3.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button3.setText("X");
//					else if (clientSide)
//						button3.setText("O");
//				}
//			});
		}
	};
	
	private OnClickListener click4 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press4 && !press4x && !gameover)
			{
				press4 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press4");
					button4.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press4");
					button4.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}
			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button4.setText("X");
//					else if (clientSide)
//						button4.setText("O");
//				}
//			});

		}
	};
	
	private OnClickListener click5 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press5 && !press5x && !gameover)
			{
				press5 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press5");
					button5.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press5");
					button5.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button5.setText("X");
//					else if (clientSide)
//						button5.setText("O");
//				}
//			});

		}
	};
	
	private OnClickListener click6 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press6 && !press6x && !gameover)
			{
				press6 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press6");
					button6.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press6");
					button6.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button6.setText("X");
//					else if (clientSide)
//						button6.setText("O");
//				}
//			});

		}
	};
	
	private OnClickListener click7 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press7 && !press7x && !gameover)
			{
				press7 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press7");
					button7.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press7");
					button7.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}
			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button7.setText("X");
//					else if (clientSide)
//						button7.setText("O");
//				}
//			});

		}
	};
	
	private OnClickListener click8 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press8 && !press8x && !gameover)
			{
				press8 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press8");
					button8.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press8");
					button8.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
			}
			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button8.setText("X");
//					else if (clientSide)
//						button8.setText("O");
//				}
//			});

		}
	};

	private OnClickListener click9 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (turn && !press9 && !press9x && !gameover)
			{
				press9 = true;
	
				if (serverSide)
				{
					connect.sendMsgFromServer("press9");
					button9.setText("X");
				}
				else if (clientSide)
				{
					connect.sendMsgFromClient("press9");
					button9.setText("O");
				}
				turn = false;
				text.setText("Press check to see if opponent has gone.");
				checkWin();
				}
			
//			handler.post(new Runnable() {
//				@Override
//				public void run() {
//					if (serverSide)
//						button9.setText("X");
//					else if (clientSide)
//						button9.setText("O");
//				}
//			});

		}
	};
	
	private OnClickListener click10 = new OnClickListener() {
		@Override
		public void onClick(View v) {
//			update();
			checker();
		}
	};
	
	private void checker()
	{
		if (gameStart && !turn && !gameover) {
			text.setText("Waiting for move...");
			
			String input = "";

				if (serverSide && connect != null)
				{
					if((input = connect.getMsgToServer()) != null)
					{
						test(input);
						turn = true;
						text.setText("Your move.");
						checkWin();
					}
				}
				else if (clientSide && connect != null)
				{
					if((input = connect.getMsgToClient()) != null)
					{
						test(input);
						turn = true;
						text.setText("Your move.");
						checkWin();
					}
				}

//				if (serverSide && connect != null)
//					connect.sendMsgFromServer(" ");
//				else if (clientSide && connect != null)
//					connect.sendMsgFromClient(" ");
				
		}
	}
	
	/** checks to see if either player has won yet.
	 * 
	 * @return 0 if neither, 1 if player, 2 if opponent.
	 */
	private void checkWin()
	{
		//1
		if (press1)
		{
			//1, 2, 3
			if (press2 && press3)
			{
				gameover = true;
				text.setText("You won!");
			}
			
			//1, 4, 7
			if (press4 && press7)
			{
				gameover = true;
				text.setText("You won!");
			}
			
			//1, 5, 9
			if (press5 && press9)
			{
				gameover = true;
				text.setText("You won!");
			}
		}
		//2, 5, 8
		if (press2 && press5 && press8)
		{
			gameover = true;
			text.setText("You won!");
		}
		//3
		if (press3)
		{
			//3, 6, 9
			if (press6 && press9)
			{
				gameover = true;
				text.setText("You won!");
			}
			
			//3, 5, 7
			if (press5 && press7)
			{
				gameover = true;
				text.setText("You won!");
			}
		}		
		//4, 5, 6
		if (press4 && press5 && press6)
		{
			gameover = true;
			text.setText("You won!");
		}
		//7, 8, 9
		if (press7 && press8 && press9)
		{
			gameover = true;
			text.setText("You won!");
		}

		//Check opponent
		
		//1
		if (press1x)
		{
			//1, 2, 3
			if (press2x && press3x)
			{
				gameover = true;
				text.setText("You lost!");
			}
			
			//1, 4, 7
			if (press4x && press7x)
			{
				gameover = true;
				text.setText("You lost!");
			}
			
			//1, 5, 9
			if (press5x && press9x)
			{
				gameover = true;
				text.setText("You lost!");
			}
		}
		//2, 5, 8
		if (press2x && press5x && press8x)
		{
			gameover = true;
			text.setText("You lost!");
		}
		//3
		if (press3x)
		{
			//3, 6, 9
			if (press6x && press9x)
			{
				gameover = true;
				text.setText("You lost!");
			}
			
			//3, 5, 7
			if (press5x && press7x)
			{
				gameover = true;
				text.setText("You lost!");
			}
		}		
		//4, 5, 6
		if (press4x && press5x && press6x)
		{
			gameover = true;
			text.setText("You lost!");
		}
		//7, 8, 9
		if (press7x && press8x && press9x)
		{
			gameover = true;
			text.setText("You lost!");
		}
		
		//no victory yet - do nothing
	}
	
	@Override
	protected void onStop() {
		super.onStop();

		connect.close();
		System.exit(0);
	}

	@Override
	protected void onPause() {
		super.onPause();

		connect.close();
		System.exit(0);
	}

}
