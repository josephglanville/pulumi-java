// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutonomousDatabaseStandbyDbArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutonomousDatabaseStandbyDbArgs Empty = new AutonomousDatabaseStandbyDbArgs();

    /**
     * The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
     * 
     */
    @Import(name="lagTimeInSeconds")
    private @Nullable Output<Integer> lagTimeInSeconds;

    /**
     * @return The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
     * 
     */
    public Optional<Output<Integer>> lagTimeInSeconds() {
        return Optional.ofNullable(this.lagTimeInSeconds);
    }

    /**
     * Additional information about the current lifecycle state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * (Updatable) The current state of the Autonomous Database. Could be set to AVAILABLE or STOPPED
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Updatable) The current state of the Autonomous Database. Could be set to AVAILABLE or STOPPED
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the Autonomous Data Guard role was switched for the Autonomous Database. For databases that have standbys in both the primary Data Guard region and a remote Data Guard standby region, this is the latest timestamp of either the database using the &#34;primary&#34; role in the primary Data Guard region, or database located in the remote Data Guard standby region.
     * 
     */
    @Import(name="timeDataGuardRoleChanged")
    private @Nullable Output<String> timeDataGuardRoleChanged;

    /**
     * @return The date and time the Autonomous Data Guard role was switched for the Autonomous Database. For databases that have standbys in both the primary Data Guard region and a remote Data Guard standby region, this is the latest timestamp of either the database using the &#34;primary&#34; role in the primary Data Guard region, or database located in the remote Data Guard standby region.
     * 
     */
    public Optional<Output<String>> timeDataGuardRoleChanged() {
        return Optional.ofNullable(this.timeDataGuardRoleChanged);
    }

    private AutonomousDatabaseStandbyDbArgs() {}

    private AutonomousDatabaseStandbyDbArgs(AutonomousDatabaseStandbyDbArgs $) {
        this.lagTimeInSeconds = $.lagTimeInSeconds;
        this.lifecycleDetails = $.lifecycleDetails;
        this.state = $.state;
        this.timeDataGuardRoleChanged = $.timeDataGuardRoleChanged;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutonomousDatabaseStandbyDbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutonomousDatabaseStandbyDbArgs $;

        public Builder() {
            $ = new AutonomousDatabaseStandbyDbArgs();
        }

        public Builder(AutonomousDatabaseStandbyDbArgs defaults) {
            $ = new AutonomousDatabaseStandbyDbArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lagTimeInSeconds The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
         * 
         * @return builder
         * 
         */
        public Builder lagTimeInSeconds(@Nullable Output<Integer> lagTimeInSeconds) {
            $.lagTimeInSeconds = lagTimeInSeconds;
            return this;
        }

        /**
         * @param lagTimeInSeconds The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
         * 
         * @return builder
         * 
         */
        public Builder lagTimeInSeconds(Integer lagTimeInSeconds) {
            return lagTimeInSeconds(Output.of(lagTimeInSeconds));
        }

        /**
         * @param lifecycleDetails Additional information about the current lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Additional information about the current lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param state (Updatable) The current state of the Autonomous Database. Could be set to AVAILABLE or STOPPED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Updatable) The current state of the Autonomous Database. Could be set to AVAILABLE or STOPPED
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeDataGuardRoleChanged The date and time the Autonomous Data Guard role was switched for the Autonomous Database. For databases that have standbys in both the primary Data Guard region and a remote Data Guard standby region, this is the latest timestamp of either the database using the &#34;primary&#34; role in the primary Data Guard region, or database located in the remote Data Guard standby region.
         * 
         * @return builder
         * 
         */
        public Builder timeDataGuardRoleChanged(@Nullable Output<String> timeDataGuardRoleChanged) {
            $.timeDataGuardRoleChanged = timeDataGuardRoleChanged;
            return this;
        }

        /**
         * @param timeDataGuardRoleChanged The date and time the Autonomous Data Guard role was switched for the Autonomous Database. For databases that have standbys in both the primary Data Guard region and a remote Data Guard standby region, this is the latest timestamp of either the database using the &#34;primary&#34; role in the primary Data Guard region, or database located in the remote Data Guard standby region.
         * 
         * @return builder
         * 
         */
        public Builder timeDataGuardRoleChanged(String timeDataGuardRoleChanged) {
            return timeDataGuardRoleChanged(Output.of(timeDataGuardRoleChanged));
        }

        public AutonomousDatabaseStandbyDbArgs build() {
            return $;
        }
    }

}
