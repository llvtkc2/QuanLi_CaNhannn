package com.example.thudemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class HuongDan_activite extends Activity {
	TextView txtdata;
	private RadioGroup group;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.huongdan_acitive);
		txtdata=(TextView)findViewById(R.id.txtrawkt);
		 group= (RadioGroup) findViewById(R.id.radiohgrouphd);
		 loadTabs();
			group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup group, int checkedId) {
					// TODO Auto-generated method stub
					switch(checkedId)
					{
					case R.id.radiobttt:
						try {
							readdingfile();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case R.id.radiobttc:
						try {
							readdingfilekc();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case R.id.radiobkv:
						try {
							readdingfilekv();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case R.id.radiobkn:
						try {
							readdingfilekn();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					
					}
					
				}

			});
			
	}
	public void loadTabs() {
		// Lấy Tabhost id ra trước (cái này của built - in android
		final TabHost tab = (TabHost) findViewById(android.R.id.tabhost);
		// gọi lệnh setup
		tab.setup();
		TabHost.TabSpec spec;
		// Tạo tab1
		spec = tab.newTabSpec("t1");
		spec.setContent(R.id.tabhd1);
		spec.setIndicator("1-Chọn Danh Mục");
		tab.addTab(spec);
		// Tạo tab2
		spec = tab.newTabSpec("t2");
		spec.setContent(R.id.tabhd2);
		spec.setIndicator("2-Hướng Dẫn Sử Dụng");
		tab.addTab(spec);
		// Thiết lập tab mặc định được chọn ban đầu là tab 0
		tab.setCurrentTab(0);
	}
	public void readdingfile() throws IOException {
		String data;
		InputStream in=getResources().getAssets().open("khoanthu1.txt");
		InputStreamReader inread= new InputStreamReader(in);
		BufferedReader bufread=new BufferedReader(inread);
		StringBuilder buder=new StringBuilder();
		if(in!=null)
		{
			try
			{
				while((data=bufread.readLine())!=null)
				{
					buder.append(data);
				}
				in.close();
				txtdata.setText(buder.toString());
			}
			catch(IOException ex)
			{
				Log.e("Error", ex.getMessage());
			}
		}
	}
	public void readdingfilekc() throws IOException {
		String data;
		InputStream in=getResources().getAssets().open("khoanchi1.txt");
		InputStreamReader inread= new InputStreamReader(in);
		BufferedReader bufread=new BufferedReader(inread);
		StringBuilder buder=new StringBuilder();
		if(in!=null)
		{
			try
			{
				while((data=bufread.readLine())!=null)
				{
					buder.append(data);
				}
				in.close();
				txtdata.setText(buder.toString());
			}
			catch(IOException ex)
			{
				Log.e("Error", ex.getMessage());
			}
		}
	}
	public void readdingfilekv() throws IOException {
		String data;
		InputStream in=getResources().getAssets().open("khoavay1.txt");
		InputStreamReader inread= new InputStreamReader(in);
		BufferedReader bufread=new BufferedReader(inread);
		StringBuilder buder=new StringBuilder();
		if(in!=null)
		{
			try
			{
				while((data=bufread.readLine())!=null)
				{
					buder.append(data);
				}
				in.close();
				txtdata.setText(buder.toString());
			}
			catch(IOException ex)
			{
				Log.e("Error", ex.getMessage());
			}
		}
	}
	public void readdingfilekn() throws IOException {
		String data;
		InputStream in=getResources().getAssets().open("khoanno1.txt");
		InputStreamReader inread= new InputStreamReader(in);
		BufferedReader bufread=new BufferedReader(inread);
		StringBuilder buder=new StringBuilder();
		if(in!=null)
		{
			try
			{
				while((data=bufread.readLine())!=null)
				{
					buder.append(data);
				}
				in.close();
				txtdata.setText(buder.toString());
			}
			catch(IOException ex)
			{
				Log.e("Error", ex.getMessage());
			}
		}
	}
}
