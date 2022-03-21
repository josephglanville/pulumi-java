// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The sync properties of the connected registry with its parent.
 * 
 */
public final class SyncPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SyncPropertiesResponse Empty = new SyncPropertiesResponse();

    /**
     * The gateway endpoint used by the connected registry to communicate with its parent.
     * 
     */
    @Import(name="gatewayEndpoint", required=true)
      private final String gatewayEndpoint;

    public String getGatewayEndpoint() {
        return this.gatewayEndpoint;
    }

    /**
     * The last time a sync occurred between the connected registry and its parent.
     * 
     */
    @Import(name="lastSyncTime", required=true)
      private final String lastSyncTime;

    public String getLastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * The period of time for which a message is available to sync before it is expired. Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     */
    @Import(name="messageTtl", required=true)
      private final String messageTtl;

    public String getMessageTtl() {
        return this.messageTtl;
    }

    /**
     * The cron expression indicating the schedule that the connected registry will sync with its parent.
     * 
     */
    @Import(name="schedule")
      private final @Nullable String schedule;

    public Optional<String> getSchedule() {
        return this.schedule == null ? Optional.empty() : Optional.ofNullable(this.schedule);
    }

    /**
     * The time window during which sync is enabled for each schedule occurrence. Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     */
    @Import(name="syncWindow")
      private final @Nullable String syncWindow;

    public Optional<String> getSyncWindow() {
        return this.syncWindow == null ? Optional.empty() : Optional.ofNullable(this.syncWindow);
    }

    /**
     * The resource ID of the ACR token used to authenticate the connected registry to its parent during sync.
     * 
     */
    @Import(name="tokenId", required=true)
      private final String tokenId;

    public String getTokenId() {
        return this.tokenId;
    }

    public SyncPropertiesResponse(
        String gatewayEndpoint,
        String lastSyncTime,
        String messageTtl,
        @Nullable String schedule,
        @Nullable String syncWindow,
        String tokenId) {
        this.gatewayEndpoint = Objects.requireNonNull(gatewayEndpoint, "expected parameter 'gatewayEndpoint' to be non-null");
        this.lastSyncTime = Objects.requireNonNull(lastSyncTime, "expected parameter 'lastSyncTime' to be non-null");
        this.messageTtl = Objects.requireNonNull(messageTtl, "expected parameter 'messageTtl' to be non-null");
        this.schedule = schedule;
        this.syncWindow = syncWindow;
        this.tokenId = Objects.requireNonNull(tokenId, "expected parameter 'tokenId' to be non-null");
    }

    private SyncPropertiesResponse() {
        this.gatewayEndpoint = null;
        this.lastSyncTime = null;
        this.messageTtl = null;
        this.schedule = null;
        this.syncWindow = null;
        this.tokenId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayEndpoint;
        private String lastSyncTime;
        private String messageTtl;
        private @Nullable String schedule;
        private @Nullable String syncWindow;
        private String tokenId;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayEndpoint = defaults.gatewayEndpoint;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.messageTtl = defaults.messageTtl;
    	      this.schedule = defaults.schedule;
    	      this.syncWindow = defaults.syncWindow;
    	      this.tokenId = defaults.tokenId;
        }

        public Builder gatewayEndpoint(String gatewayEndpoint) {
            this.gatewayEndpoint = Objects.requireNonNull(gatewayEndpoint);
            return this;
        }
        public Builder lastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }
        public Builder messageTtl(String messageTtl) {
            this.messageTtl = Objects.requireNonNull(messageTtl);
            return this;
        }
        public Builder schedule(@Nullable String schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder syncWindow(@Nullable String syncWindow) {
            this.syncWindow = syncWindow;
            return this;
        }
        public Builder tokenId(String tokenId) {
            this.tokenId = Objects.requireNonNull(tokenId);
            return this;
        }        public SyncPropertiesResponse build() {
            return new SyncPropertiesResponse(gatewayEndpoint, lastSyncTime, messageTtl, schedule, syncWindow, tokenId);
        }
    }
}
