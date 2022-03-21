// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationApplicationSnapshotConfiguration {
    /**
     * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    private final Boolean snapshotsEnabled;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationApplicationSnapshotConfiguration(@CustomType.Parameter("snapshotsEnabled") Boolean snapshotsEnabled) {
        this.snapshotsEnabled = snapshotsEnabled;
    }

    /**
     * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
     * 
    */
    public Boolean getSnapshotsEnabled() {
        return this.snapshotsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationSnapshotConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean snapshotsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationSnapshotConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotsEnabled = defaults.snapshotsEnabled;
        }

        public Builder snapshotsEnabled(Boolean snapshotsEnabled) {
            this.snapshotsEnabled = Objects.requireNonNull(snapshotsEnabled);
            return this;
        }        public ApplicationApplicationConfigurationApplicationSnapshotConfiguration build() {
            return new ApplicationApplicationConfigurationApplicationSnapshotConfiguration(snapshotsEnabled);
        }
    }
}
