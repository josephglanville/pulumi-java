// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseMigration.outputs.MigrationGoldenGateDetailsSettingsExtract;
import com.pulumi.oci.DatabaseMigration.outputs.MigrationGoldenGateDetailsSettingsReplicat;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationGoldenGateDetailsSettings {
    /**
     * @return (Updatable) ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     * 
     */
    private final @Nullable Integer acceptableLag;
    /**
     * @return (Updatable) Parameters for GoldenGate Extract processes.
     * 
     */
    private final @Nullable MigrationGoldenGateDetailsSettingsExtract extract;
    /**
     * @return (Updatable) Parameters for GoldenGate Replicat processes.
     * 
     */
    private final @Nullable MigrationGoldenGateDetailsSettingsReplicat replicat;

    @CustomType.Constructor
    private MigrationGoldenGateDetailsSettings(
        @CustomType.Parameter("acceptableLag") @Nullable Integer acceptableLag,
        @CustomType.Parameter("extract") @Nullable MigrationGoldenGateDetailsSettingsExtract extract,
        @CustomType.Parameter("replicat") @Nullable MigrationGoldenGateDetailsSettingsReplicat replicat) {
        this.acceptableLag = acceptableLag;
        this.extract = extract;
        this.replicat = replicat;
    }

    /**
     * @return (Updatable) ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     * 
     */
    public Optional<Integer> acceptableLag() {
        return Optional.ofNullable(this.acceptableLag);
    }
    /**
     * @return (Updatable) Parameters for GoldenGate Extract processes.
     * 
     */
    public Optional<MigrationGoldenGateDetailsSettingsExtract> extract() {
        return Optional.ofNullable(this.extract);
    }
    /**
     * @return (Updatable) Parameters for GoldenGate Replicat processes.
     * 
     */
    public Optional<MigrationGoldenGateDetailsSettingsReplicat> replicat() {
        return Optional.ofNullable(this.replicat);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationGoldenGateDetailsSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer acceptableLag;
        private @Nullable MigrationGoldenGateDetailsSettingsExtract extract;
        private @Nullable MigrationGoldenGateDetailsSettingsReplicat replicat;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationGoldenGateDetailsSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptableLag = defaults.acceptableLag;
    	      this.extract = defaults.extract;
    	      this.replicat = defaults.replicat;
        }

        public Builder acceptableLag(@Nullable Integer acceptableLag) {
            this.acceptableLag = acceptableLag;
            return this;
        }
        public Builder extract(@Nullable MigrationGoldenGateDetailsSettingsExtract extract) {
            this.extract = extract;
            return this;
        }
        public Builder replicat(@Nullable MigrationGoldenGateDetailsSettingsReplicat replicat) {
            this.replicat = replicat;
            return this;
        }        public MigrationGoldenGateDetailsSettings build() {
            return new MigrationGoldenGateDetailsSettings(acceptableLag, extract, replicat);
        }
    }
}
