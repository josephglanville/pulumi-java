// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationPreferenceResponse {
    /**
     * The App Engine application to follow, it must be in the same region as the Cloud SQL instance. WARNING: Changing this might restart the instance.
     * 
     */
    private final String followGaeApplication;
    /**
     * This is always `sql#locationPreference`.
     * 
     */
    private final String kind;
    /**
     * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.). Reserved for future use.
     * 
     */
    private final String secondaryZone;
    /**
     * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). WARNING: Changing this might restart the instance.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private LocationPreferenceResponse(
        @CustomType.Parameter("followGaeApplication") String followGaeApplication,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("secondaryZone") String secondaryZone,
        @CustomType.Parameter("zone") String zone) {
        this.followGaeApplication = followGaeApplication;
        this.kind = kind;
        this.secondaryZone = secondaryZone;
        this.zone = zone;
    }

    /**
     * The App Engine application to follow, it must be in the same region as the Cloud SQL instance. WARNING: Changing this might restart the instance.
     * 
    */
    public String getFollowGaeApplication() {
        return this.followGaeApplication;
    }
    /**
     * This is always `sql#locationPreference`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.). Reserved for future use.
     * 
    */
    public String getSecondaryZone() {
        return this.secondaryZone;
    }
    /**
     * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). WARNING: Changing this might restart the instance.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationPreferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String followGaeApplication;
        private String kind;
        private String secondaryZone;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationPreferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followGaeApplication = defaults.followGaeApplication;
    	      this.kind = defaults.kind;
    	      this.secondaryZone = defaults.secondaryZone;
    	      this.zone = defaults.zone;
        }

        public Builder followGaeApplication(String followGaeApplication) {
            this.followGaeApplication = Objects.requireNonNull(followGaeApplication);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder secondaryZone(String secondaryZone) {
            this.secondaryZone = Objects.requireNonNull(secondaryZone);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public LocationPreferenceResponse build() {
            return new LocationPreferenceResponse(followGaeApplication, kind, secondaryZone, zone);
        }
    }
}
