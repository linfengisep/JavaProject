public abstract class SpotsActivity {

   private ToggleSwitchView liveSpotToggleSwitchView;
   //spotCardView = findViewById(R.id.spot_card_view);
   liveSpotToggleSwitchView = findViewById(R.id.live_spot_view);
   //there are left and right button in the live_spot_view;

   liveSpotToggleSwitchView.setOnLeftButtonClickListener(new ToggleSwitchView.OnClickListener() {
     @Override public void onClick() {
       Toast.makeText(SpotsActivity.this, "LEFT CLICKED", Toast.LENGTH_LONG).show();
     }
  });

  liveSpotToggleSwitchView.setOnRightButtonClickListener(new ToggleSwitchView.OnClickListener() {
     @Override public void onClick() {
       Toast.makeText(SpotsActivity.this, "RIGHT CLICKED", Toast.LENGTH_LONG).show();
     }
  });
