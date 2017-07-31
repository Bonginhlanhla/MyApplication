package com.example.admin.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import static com.example.admin.myapplication.R.id.imageResturant;

import com.bumptech.glide.Glide;

import java.security.PrivateKey;
import java.util.ArrayList;

import static com.example.admin.myapplication.R.id.imageResturant;
import static com.example.admin.myapplication.R.id.listViews;
import static com.example.admin.myapplication.R.id.list_item;

/**
 * Created by Admin on 7/18/2017.
 */

public class TourAdapter extends ArrayAdapter<TourItems> {

    private Context mContext;

    ArrayList<TourItems> tourItemArrayList;

    public TourAdapter(Context context, ArrayList<TourItems> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
        mContext = context;
       this.tourItemArrayList=tourItemArrayList;

    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        TourItems tourItem = getItem(position);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        ImageView imgResturant = (ImageView) listItemView.findViewById(R.id.imageResturant);
        if(MainActivity.CHECK_ACTIVITY.equals("ResturantActivity"))
        {
            String [] url = {"https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/Yankeess.png?alt=media&token=4015e4d6-7394-408c-8175-1e1e7b0b000c",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/News%20Cafe.png?alt=media&token=62ab5763-9a6a-4818-9180-f9bac67afafb",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/Lambrusco.jpg?alt=media&token=d4d3b790-9730-456a-aad7-0ad92304271a",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/6-Pizza_Del_FornoGoldmans.jpg?alt=media&token=924812fe-3db4-4a39-ba1c-ecd6fe0c622e"};
            Glide.with(imgResturant.getContext()).load(url[position]).into(imgResturant);
        }
        else if(MainActivity.CHECK_ACTIVITY.equals("HotelActivity"))
        {
            String [] url = {"https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/hotels.jpg?alt=media&token=294072fd-af91-4f9c-b536-87fe9b0c6324",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/The-Randburg-Towers-Hotel_1.jpg?alt=media&token=a2bbec2f-7cf8-4674-9dd6-ed86988713bd",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/remote.jpg.jpg?alt=media&token=355b9a10-f60f-4122-9b3c-ec4ff11a5335",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/hotelfrnt.jpg?alt=media&token=18457cfe-07b0-4f6e-aef8-2d95b9ff6fdb"};
            Glide.with(imgResturant.getContext()).load(url[position]).into(imgResturant);
        }
        else if(MainActivity.CHECK_ACTIVITY.equals("CarServiceActivity"))
        {
            String [] url = {"https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/western_auto.jpg?alt=media&token=1956cfc7-0e41-4bb0-88d0-246d914d337f",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/carspares.png?alt=media&token=4d8fcfc6-1c77-4cdd-9b79-9ac4bbd0b553",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/CroppedImage420320-Wairau-Park.png?alt=media&token=9191d554-caab-4c19-b8d6-d4f733839d3b",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/car_services.jpg?alt=media&token=e76795bc-4d00-42eb-bb34-46c8faef1204"};
            Glide.with(imgResturant.getContext()).load(url[position]).into(imgResturant);
        }
        else if(MainActivity.CHECK_ACTIVITY.equals("GasStationActivity"))
        {
            String [] url = {"https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/gas_station.jpg?alt=media&token=928418ba-13db-486b-9523-e30b1f58355a",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/engen.png?alt=media&token=c1d228d5-54c7-4a99-bac7-cda299eb5bb1",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/Total.jpg?alt=media&token=16bd722f-aea3-4aa4-a7fa-da1c7c55b3df",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/CroppedImage420320-Wairau-Park.png?alt=media&token=9191d554-caab-4c19-b8d6-d4f733839d3b"};
            Glide.with(imgResturant.getContext()).load(url[position]).into(imgResturant);
        }
        else if(MainActivity.CHECK_ACTIVITY.equals("HospitalActivity"))
        {
            String [] url = {"https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/gas_station.jpg?alt=media&token=928418ba-13db-486b-9523-e30b1f58355a",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/engen.png?alt=media&token=c1d228d5-54c7-4a99-bac7-cda299eb5bb1",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/Total.jpg?alt=media&token=16bd722f-aea3-4aa4-a7fa-da1c7c55b3df",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/CroppedImage420320-Wairau-Park.png?alt=media&token=9191d554-caab-4c19-b8d6-d4f733839d3b"};
            Glide.with(imgResturant.getContext()).load(url[position]).into(imgResturant);
        }
        else if(MainActivity.CHECK_ACTIVITY.equals("ShoppingActivity"))
        {
            String [] url = {"https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/gas_station.jpg?alt=media&token=928418ba-13db-486b-9523-e30b1f58355a",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/engen.png?alt=media&token=c1d228d5-54c7-4a99-bac7-cda299eb5bb1",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/Total.jpg?alt=media&token=16bd722f-aea3-4aa4-a7fa-da1c7c55b3df",
                    "https://firebasestorage.googleapis.com/v0/b/myapplication-e1a0b.appspot.com/o/CroppedImage420320-Wairau-Park.png?alt=media&token=9191d554-caab-4c19-b8d6-d4f733839d3b"};
            Glide.with(imgResturant.getContext()).load(url[position]).into(imgResturant);
        }

//

//
          TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_textview_lv);
//        TextView locTextView = (TextView) convertView.findViewById(R.id.loc_textview_lv);
//
//
         descTextView.setText(tourItem.getEventDesc());
//        locTextView.setText(tourItem.getLocation());
//
        return listItemView;
    }

}
