// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class NotificationPreferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationPreferenceResponse Empty = new NotificationPreferenceResponse();

    @InputImport(name="sendNotification", required=true)
    private final Boolean sendNotification;

    public Boolean getSendNotification() {
        return this.sendNotification;
    }

    @InputImport(name="stageName", required=true)
    private final String stageName;

    public String getStageName() {
        return this.stageName;
    }

    public NotificationPreferenceResponse(
        Boolean sendNotification,
        String stageName) {
        this.sendNotification = sendNotification == null ? true : Objects.requireNonNull(sendNotification, "expected parameter 'sendNotification' to be non-null");
        this.stageName = Objects.requireNonNull(stageName, "expected parameter 'stageName' to be non-null");
    }

    private NotificationPreferenceResponse() {
        this.sendNotification = null;
        this.stageName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPreferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean sendNotification;
        private String stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationPreferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sendNotification = defaults.sendNotification;
    	      this.stageName = defaults.stageName;
        }

        public Builder setSendNotification(Boolean sendNotification) {
            this.sendNotification = Objects.requireNonNull(sendNotification);
            return this;
        }

        public Builder setStageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }

        public NotificationPreferenceResponse build() {
            return new NotificationPreferenceResponse(sendNotification, stageName);
        }
    }
}
