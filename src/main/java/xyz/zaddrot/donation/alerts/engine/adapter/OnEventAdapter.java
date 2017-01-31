package xyz.zaddrot.donation.alerts.engine.adapter;

import com.google.common.eventbus.Subscribe;
import org.json.JSONObject;
import xyz.zaddrot.donation.alerts.entity.Donation;

/**
 * Created by night on 31.01.2017.
 */
public abstract class OnEventAdapter {
    @Subscribe
    public abstract void onDonation(Donation donation);

    @Subscribe
    public abstract void onTimeout(JSONObject timeout);
}
