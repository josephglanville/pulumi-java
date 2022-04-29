// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DatabaseMigration.inputs.MigrationGoldenGateDetailsSettingsExtractArgs;
import com.pulumi.oci.DatabaseMigration.inputs.MigrationGoldenGateDetailsSettingsReplicatArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationGoldenGateDetailsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrationGoldenGateDetailsSettingsArgs Empty = new MigrationGoldenGateDetailsSettingsArgs();

    /**
     * (Updatable) ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     * 
     */
    @Import(name="acceptableLag")
    private @Nullable Output<Integer> acceptableLag;

    /**
     * @return (Updatable) ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     * 
     */
    public Optional<Output<Integer>> acceptableLag() {
        return Optional.ofNullable(this.acceptableLag);
    }

    /**
     * (Updatable) Parameters for GoldenGate Extract processes.
     * 
     */
    @Import(name="extract")
    private @Nullable Output<MigrationGoldenGateDetailsSettingsExtractArgs> extract;

    /**
     * @return (Updatable) Parameters for GoldenGate Extract processes.
     * 
     */
    public Optional<Output<MigrationGoldenGateDetailsSettingsExtractArgs>> extract() {
        return Optional.ofNullable(this.extract);
    }

    /**
     * (Updatable) Parameters for GoldenGate Replicat processes.
     * 
     */
    @Import(name="replicat")
    private @Nullable Output<MigrationGoldenGateDetailsSettingsReplicatArgs> replicat;

    /**
     * @return (Updatable) Parameters for GoldenGate Replicat processes.
     * 
     */
    public Optional<Output<MigrationGoldenGateDetailsSettingsReplicatArgs>> replicat() {
        return Optional.ofNullable(this.replicat);
    }

    private MigrationGoldenGateDetailsSettingsArgs() {}

    private MigrationGoldenGateDetailsSettingsArgs(MigrationGoldenGateDetailsSettingsArgs $) {
        this.acceptableLag = $.acceptableLag;
        this.extract = $.extract;
        this.replicat = $.replicat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationGoldenGateDetailsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationGoldenGateDetailsSettingsArgs $;

        public Builder() {
            $ = new MigrationGoldenGateDetailsSettingsArgs();
        }

        public Builder(MigrationGoldenGateDetailsSettingsArgs defaults) {
            $ = new MigrationGoldenGateDetailsSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptableLag (Updatable) ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
         * 
         * @return builder
         * 
         */
        public Builder acceptableLag(@Nullable Output<Integer> acceptableLag) {
            $.acceptableLag = acceptableLag;
            return this;
        }

        /**
         * @param acceptableLag (Updatable) ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
         * 
         * @return builder
         * 
         */
        public Builder acceptableLag(Integer acceptableLag) {
            return acceptableLag(Output.of(acceptableLag));
        }

        /**
         * @param extract (Updatable) Parameters for GoldenGate Extract processes.
         * 
         * @return builder
         * 
         */
        public Builder extract(@Nullable Output<MigrationGoldenGateDetailsSettingsExtractArgs> extract) {
            $.extract = extract;
            return this;
        }

        /**
         * @param extract (Updatable) Parameters for GoldenGate Extract processes.
         * 
         * @return builder
         * 
         */
        public Builder extract(MigrationGoldenGateDetailsSettingsExtractArgs extract) {
            return extract(Output.of(extract));
        }

        /**
         * @param replicat (Updatable) Parameters for GoldenGate Replicat processes.
         * 
         * @return builder
         * 
         */
        public Builder replicat(@Nullable Output<MigrationGoldenGateDetailsSettingsReplicatArgs> replicat) {
            $.replicat = replicat;
            return this;
        }

        /**
         * @param replicat (Updatable) Parameters for GoldenGate Replicat processes.
         * 
         * @return builder
         * 
         */
        public Builder replicat(MigrationGoldenGateDetailsSettingsReplicatArgs replicat) {
            return replicat(Output.of(replicat));
        }

        public MigrationGoldenGateDetailsSettingsArgs build() {
            return $;
        }
    }

}
