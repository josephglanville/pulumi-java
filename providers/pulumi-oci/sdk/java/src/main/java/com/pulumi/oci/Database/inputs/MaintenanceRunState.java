// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.MaintenanceRunEstimatedPatchingTimeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceRunState extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceRunState Empty = new MaintenanceRunState();

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) The current custom action timeout between the current database servers during waiting state in addition to custom action timeout, from 0 (zero) to 30 minutes.
     * 
     */
    @Import(name="currentCustomActionTimeoutInMins")
    private @Nullable Output<Integer> currentCustomActionTimeoutInMins;

    /**
     * @return (Updatable) The current custom action timeout between the current database servers during waiting state in addition to custom action timeout, from 0 (zero) to 30 minutes.
     * 
     */
    public Optional<Output<Integer>> currentCustomActionTimeoutInMins() {
        return Optional.ofNullable(this.currentCustomActionTimeoutInMins);
    }

    /**
     * The name of the current infrastruture component that is getting patched.
     * 
     */
    @Import(name="currentPatchingComponent")
    private @Nullable Output<String> currentPatchingComponent;

    /**
     * @return The name of the current infrastruture component that is getting patched.
     * 
     */
    public Optional<Output<String>> currentPatchingComponent() {
        return Optional.ofNullable(this.currentPatchingComponent);
    }

    /**
     * (Updatable) Determines the amount of time the system will wait before the start of each database server patching operation. Specify a number of minutes from 15 to 120.
     * 
     */
    @Import(name="customActionTimeoutInMins")
    private @Nullable Output<Integer> customActionTimeoutInMins;

    /**
     * @return (Updatable) Determines the amount of time the system will wait before the start of each database server patching operation. Specify a number of minutes from 15 to 120.
     * 
     */
    public Optional<Output<Integer>> customActionTimeoutInMins() {
        return Optional.ofNullable(this.customActionTimeoutInMins);
    }

    /**
     * Description of the maintenance run.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the maintenance run.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The user-friendly name for the maintenance run.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The user-friendly name for the maintenance run.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The estimated start time of the next infrastruture component patching operation.
     * 
     */
    @Import(name="estimatedComponentPatchingStartTime")
    private @Nullable Output<String> estimatedComponentPatchingStartTime;

    /**
     * @return The estimated start time of the next infrastruture component patching operation.
     * 
     */
    public Optional<Output<String>> estimatedComponentPatchingStartTime() {
        return Optional.ofNullable(this.estimatedComponentPatchingStartTime);
    }

    /**
     * The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
     * 
     */
    @Import(name="estimatedPatchingTimes")
    private @Nullable Output<List<MaintenanceRunEstimatedPatchingTimeArgs>> estimatedPatchingTimes;

    /**
     * @return The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
     * 
     */
    public Optional<Output<List<MaintenanceRunEstimatedPatchingTimeArgs>>> estimatedPatchingTimes() {
        return Optional.ofNullable(this.estimatedPatchingTimes);
    }

    /**
     * (Updatable) If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     * 
     */
    @Import(name="isCustomActionTimeoutEnabled")
    private @Nullable Output<Boolean> isCustomActionTimeoutEnabled;

    /**
     * @return (Updatable) If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     * 
     */
    public Optional<Output<Boolean>> isCustomActionTimeoutEnabled() {
        return Optional.ofNullable(this.isCustomActionTimeoutEnabled);
    }

    /**
     * (Updatable) If `FALSE`, skips the maintenance run.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return (Updatable) If `FALSE`, skips the maintenance run.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * (Updatable) If set to `TRUE`, starts patching immediately.
     * 
     */
    @Import(name="isPatchNowEnabled")
    private @Nullable Output<Boolean> isPatchNowEnabled;

    /**
     * @return (Updatable) If set to `TRUE`, starts patching immediately.
     * 
     */
    public Optional<Output<Boolean>> isPatchNowEnabled() {
        return Optional.ofNullable(this.isPatchNowEnabled);
    }

    /**
     * (Updatable) If true, then the patching is resumed and the next component will be patched immediately.
     * 
     */
    @Import(name="isResumePatching")
    private @Nullable Output<Boolean> isResumePatching;

    /**
     * @return (Updatable) If true, then the patching is resumed and the next component will be patched immediately.
     * 
     */
    public Optional<Output<Boolean>> isResumePatching() {
        return Optional.ofNullable(this.isResumePatching);
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
     * The maintenance run OCID.
     * 
     */
    @Import(name="maintenanceRunId")
    private @Nullable Output<String> maintenanceRunId;

    /**
     * @return The maintenance run OCID.
     * 
     */
    public Optional<Output<String>> maintenanceRunId() {
        return Optional.ofNullable(this.maintenanceRunId);
    }

    /**
     * Maintenance sub-type.
     * 
     */
    @Import(name="maintenanceSubtype")
    private @Nullable Output<String> maintenanceSubtype;

    /**
     * @return Maintenance sub-type.
     * 
     */
    public Optional<Output<String>> maintenanceSubtype() {
        return Optional.ofNullable(this.maintenanceSubtype);
    }

    /**
     * Maintenance type.
     * 
     */
    @Import(name="maintenanceType")
    private @Nullable Output<String> maintenanceType;

    /**
     * @return Maintenance type.
     * 
     */
    public Optional<Output<String>> maintenanceType() {
        return Optional.ofNullable(this.maintenanceType);
    }

    /**
     * Contain the patch failure count.
     * 
     */
    @Import(name="patchFailureCount")
    private @Nullable Output<Integer> patchFailureCount;

    /**
     * @return Contain the patch failure count.
     * 
     */
    public Optional<Output<Integer>> patchFailureCount() {
        return Optional.ofNullable(this.patchFailureCount);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch to be applied in the maintenance run.
     * 
     */
    @Import(name="patchId")
    private @Nullable Output<String> patchId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch to be applied in the maintenance run.
     * 
     */
    public Optional<Output<String>> patchId() {
        return Optional.ofNullable(this.patchId);
    }

    /**
     * The time when the patching operation ended.
     * 
     */
    @Import(name="patchingEndTime")
    private @Nullable Output<String> patchingEndTime;

    /**
     * @return The time when the patching operation ended.
     * 
     */
    public Optional<Output<String>> patchingEndTime() {
        return Optional.ofNullable(this.patchingEndTime);
    }

    /**
     * (Updatable) Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
     * 
     */
    @Import(name="patchingMode")
    private @Nullable Output<String> patchingMode;

    /**
     * @return (Updatable) Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
     * 
     */
    public Optional<Output<String>> patchingMode() {
        return Optional.ofNullable(this.patchingMode);
    }

    /**
     * The time when the patching operation started.
     * 
     */
    @Import(name="patchingStartTime")
    private @Nullable Output<String> patchingStartTime;

    /**
     * @return The time when the patching operation started.
     * 
     */
    public Optional<Output<String>> patchingStartTime() {
        return Optional.ofNullable(this.patchingStartTime);
    }

    /**
     * The status of the patching operation.
     * 
     */
    @Import(name="patchingStatus")
    private @Nullable Output<String> patchingStatus;

    /**
     * @return The status of the patching operation.
     * 
     */
    public Optional<Output<String>> patchingStatus() {
        return Optional.ofNullable(this.patchingStatus);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association&#39;s peer container database.
     * 
     */
    @Import(name="peerMaintenanceRunId")
    private @Nullable Output<String> peerMaintenanceRunId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association&#39;s peer container database.
     * 
     */
    public Optional<Output<String>> peerMaintenanceRunId() {
        return Optional.ofNullable(this.peerMaintenanceRunId);
    }

    /**
     * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The target software version for the database server patching operation.
     * 
     */
    @Import(name="targetDbServerVersion")
    private @Nullable Output<String> targetDbServerVersion;

    /**
     * @return The target software version for the database server patching operation.
     * 
     */
    public Optional<Output<String>> targetDbServerVersion() {
        return Optional.ofNullable(this.targetDbServerVersion);
    }

    /**
     * The ID of the target resource on which the maintenance run occurs.
     * 
     */
    @Import(name="targetResourceId")
    private @Nullable Output<String> targetResourceId;

    /**
     * @return The ID of the target resource on which the maintenance run occurs.
     * 
     */
    public Optional<Output<String>> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }

    /**
     * The type of the target resource on which the maintenance run occurs.
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable Output<String> targetResourceType;

    /**
     * @return The type of the target resource on which the maintenance run occurs.
     * 
     */
    public Optional<Output<String>> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    /**
     * The target Cell version that is to be patched to.
     * 
     */
    @Import(name="targetStorageServerVersion")
    private @Nullable Output<String> targetStorageServerVersion;

    /**
     * @return The target Cell version that is to be patched to.
     * 
     */
    public Optional<Output<String>> targetStorageServerVersion() {
        return Optional.ofNullable(this.targetStorageServerVersion);
    }

    /**
     * The date and time the maintenance run was completed.
     * 
     */
    @Import(name="timeEnded")
    private @Nullable Output<String> timeEnded;

    /**
     * @return The date and time the maintenance run was completed.
     * 
     */
    public Optional<Output<String>> timeEnded() {
        return Optional.ofNullable(this.timeEnded);
    }

    /**
     * (Updatable) The scheduled date and time of the maintenance run to update.
     * 
     */
    @Import(name="timeScheduled")
    private @Nullable Output<String> timeScheduled;

    /**
     * @return (Updatable) The scheduled date and time of the maintenance run to update.
     * 
     */
    public Optional<Output<String>> timeScheduled() {
        return Optional.ofNullable(this.timeScheduled);
    }

    /**
     * The date and time the maintenance run starts.
     * 
     */
    @Import(name="timeStarted")
    private @Nullable Output<String> timeStarted;

    /**
     * @return The date and time the maintenance run starts.
     * 
     */
    public Optional<Output<String>> timeStarted() {
        return Optional.ofNullable(this.timeStarted);
    }

    private MaintenanceRunState() {}

    private MaintenanceRunState(MaintenanceRunState $) {
        this.compartmentId = $.compartmentId;
        this.currentCustomActionTimeoutInMins = $.currentCustomActionTimeoutInMins;
        this.currentPatchingComponent = $.currentPatchingComponent;
        this.customActionTimeoutInMins = $.customActionTimeoutInMins;
        this.description = $.description;
        this.displayName = $.displayName;
        this.estimatedComponentPatchingStartTime = $.estimatedComponentPatchingStartTime;
        this.estimatedPatchingTimes = $.estimatedPatchingTimes;
        this.isCustomActionTimeoutEnabled = $.isCustomActionTimeoutEnabled;
        this.isEnabled = $.isEnabled;
        this.isPatchNowEnabled = $.isPatchNowEnabled;
        this.isResumePatching = $.isResumePatching;
        this.lifecycleDetails = $.lifecycleDetails;
        this.maintenanceRunId = $.maintenanceRunId;
        this.maintenanceSubtype = $.maintenanceSubtype;
        this.maintenanceType = $.maintenanceType;
        this.patchFailureCount = $.patchFailureCount;
        this.patchId = $.patchId;
        this.patchingEndTime = $.patchingEndTime;
        this.patchingMode = $.patchingMode;
        this.patchingStartTime = $.patchingStartTime;
        this.patchingStatus = $.patchingStatus;
        this.peerMaintenanceRunId = $.peerMaintenanceRunId;
        this.state = $.state;
        this.targetDbServerVersion = $.targetDbServerVersion;
        this.targetResourceId = $.targetResourceId;
        this.targetResourceType = $.targetResourceType;
        this.targetStorageServerVersion = $.targetStorageServerVersion;
        this.timeEnded = $.timeEnded;
        this.timeScheduled = $.timeScheduled;
        this.timeStarted = $.timeStarted;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceRunState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceRunState $;

        public Builder() {
            $ = new MaintenanceRunState();
        }

        public Builder(MaintenanceRunState defaults) {
            $ = new MaintenanceRunState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param currentCustomActionTimeoutInMins (Updatable) The current custom action timeout between the current database servers during waiting state in addition to custom action timeout, from 0 (zero) to 30 minutes.
         * 
         * @return builder
         * 
         */
        public Builder currentCustomActionTimeoutInMins(@Nullable Output<Integer> currentCustomActionTimeoutInMins) {
            $.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
            return this;
        }

        /**
         * @param currentCustomActionTimeoutInMins (Updatable) The current custom action timeout between the current database servers during waiting state in addition to custom action timeout, from 0 (zero) to 30 minutes.
         * 
         * @return builder
         * 
         */
        public Builder currentCustomActionTimeoutInMins(Integer currentCustomActionTimeoutInMins) {
            return currentCustomActionTimeoutInMins(Output.of(currentCustomActionTimeoutInMins));
        }

        /**
         * @param currentPatchingComponent The name of the current infrastruture component that is getting patched.
         * 
         * @return builder
         * 
         */
        public Builder currentPatchingComponent(@Nullable Output<String> currentPatchingComponent) {
            $.currentPatchingComponent = currentPatchingComponent;
            return this;
        }

        /**
         * @param currentPatchingComponent The name of the current infrastruture component that is getting patched.
         * 
         * @return builder
         * 
         */
        public Builder currentPatchingComponent(String currentPatchingComponent) {
            return currentPatchingComponent(Output.of(currentPatchingComponent));
        }

        /**
         * @param customActionTimeoutInMins (Updatable) Determines the amount of time the system will wait before the start of each database server patching operation. Specify a number of minutes from 15 to 120.
         * 
         * @return builder
         * 
         */
        public Builder customActionTimeoutInMins(@Nullable Output<Integer> customActionTimeoutInMins) {
            $.customActionTimeoutInMins = customActionTimeoutInMins;
            return this;
        }

        /**
         * @param customActionTimeoutInMins (Updatable) Determines the amount of time the system will wait before the start of each database server patching operation. Specify a number of minutes from 15 to 120.
         * 
         * @return builder
         * 
         */
        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            return customActionTimeoutInMins(Output.of(customActionTimeoutInMins));
        }

        /**
         * @param description Description of the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The user-friendly name for the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user-friendly name for the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param estimatedComponentPatchingStartTime The estimated start time of the next infrastruture component patching operation.
         * 
         * @return builder
         * 
         */
        public Builder estimatedComponentPatchingStartTime(@Nullable Output<String> estimatedComponentPatchingStartTime) {
            $.estimatedComponentPatchingStartTime = estimatedComponentPatchingStartTime;
            return this;
        }

        /**
         * @param estimatedComponentPatchingStartTime The estimated start time of the next infrastruture component patching operation.
         * 
         * @return builder
         * 
         */
        public Builder estimatedComponentPatchingStartTime(String estimatedComponentPatchingStartTime) {
            return estimatedComponentPatchingStartTime(Output.of(estimatedComponentPatchingStartTime));
        }

        /**
         * @param estimatedPatchingTimes The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
         * 
         * @return builder
         * 
         */
        public Builder estimatedPatchingTimes(@Nullable Output<List<MaintenanceRunEstimatedPatchingTimeArgs>> estimatedPatchingTimes) {
            $.estimatedPatchingTimes = estimatedPatchingTimes;
            return this;
        }

        /**
         * @param estimatedPatchingTimes The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
         * 
         * @return builder
         * 
         */
        public Builder estimatedPatchingTimes(List<MaintenanceRunEstimatedPatchingTimeArgs> estimatedPatchingTimes) {
            return estimatedPatchingTimes(Output.of(estimatedPatchingTimes));
        }

        /**
         * @param estimatedPatchingTimes The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
         * 
         * @return builder
         * 
         */
        public Builder estimatedPatchingTimes(MaintenanceRunEstimatedPatchingTimeArgs... estimatedPatchingTimes) {
            return estimatedPatchingTimes(List.of(estimatedPatchingTimes));
        }

        /**
         * @param isCustomActionTimeoutEnabled (Updatable) If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
         * 
         * @return builder
         * 
         */
        public Builder isCustomActionTimeoutEnabled(@Nullable Output<Boolean> isCustomActionTimeoutEnabled) {
            $.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            return this;
        }

        /**
         * @param isCustomActionTimeoutEnabled (Updatable) If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
         * 
         * @return builder
         * 
         */
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            return isCustomActionTimeoutEnabled(Output.of(isCustomActionTimeoutEnabled));
        }

        /**
         * @param isEnabled (Updatable) If `FALSE`, skips the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled (Updatable) If `FALSE`, skips the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param isPatchNowEnabled (Updatable) If set to `TRUE`, starts patching immediately.
         * 
         * @return builder
         * 
         */
        public Builder isPatchNowEnabled(@Nullable Output<Boolean> isPatchNowEnabled) {
            $.isPatchNowEnabled = isPatchNowEnabled;
            return this;
        }

        /**
         * @param isPatchNowEnabled (Updatable) If set to `TRUE`, starts patching immediately.
         * 
         * @return builder
         * 
         */
        public Builder isPatchNowEnabled(Boolean isPatchNowEnabled) {
            return isPatchNowEnabled(Output.of(isPatchNowEnabled));
        }

        /**
         * @param isResumePatching (Updatable) If true, then the patching is resumed and the next component will be patched immediately.
         * 
         * @return builder
         * 
         */
        public Builder isResumePatching(@Nullable Output<Boolean> isResumePatching) {
            $.isResumePatching = isResumePatching;
            return this;
        }

        /**
         * @param isResumePatching (Updatable) If true, then the patching is resumed and the next component will be patched immediately.
         * 
         * @return builder
         * 
         */
        public Builder isResumePatching(Boolean isResumePatching) {
            return isResumePatching(Output.of(isResumePatching));
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
         * @param maintenanceRunId The maintenance run OCID.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceRunId(@Nullable Output<String> maintenanceRunId) {
            $.maintenanceRunId = maintenanceRunId;
            return this;
        }

        /**
         * @param maintenanceRunId The maintenance run OCID.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            return maintenanceRunId(Output.of(maintenanceRunId));
        }

        /**
         * @param maintenanceSubtype Maintenance sub-type.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceSubtype(@Nullable Output<String> maintenanceSubtype) {
            $.maintenanceSubtype = maintenanceSubtype;
            return this;
        }

        /**
         * @param maintenanceSubtype Maintenance sub-type.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceSubtype(String maintenanceSubtype) {
            return maintenanceSubtype(Output.of(maintenanceSubtype));
        }

        /**
         * @param maintenanceType Maintenance type.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceType(@Nullable Output<String> maintenanceType) {
            $.maintenanceType = maintenanceType;
            return this;
        }

        /**
         * @param maintenanceType Maintenance type.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceType(String maintenanceType) {
            return maintenanceType(Output.of(maintenanceType));
        }

        /**
         * @param patchFailureCount Contain the patch failure count.
         * 
         * @return builder
         * 
         */
        public Builder patchFailureCount(@Nullable Output<Integer> patchFailureCount) {
            $.patchFailureCount = patchFailureCount;
            return this;
        }

        /**
         * @param patchFailureCount Contain the patch failure count.
         * 
         * @return builder
         * 
         */
        public Builder patchFailureCount(Integer patchFailureCount) {
            return patchFailureCount(Output.of(patchFailureCount));
        }

        /**
         * @param patchId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch to be applied in the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder patchId(@Nullable Output<String> patchId) {
            $.patchId = patchId;
            return this;
        }

        /**
         * @param patchId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch to be applied in the maintenance run.
         * 
         * @return builder
         * 
         */
        public Builder patchId(String patchId) {
            return patchId(Output.of(patchId));
        }

        /**
         * @param patchingEndTime The time when the patching operation ended.
         * 
         * @return builder
         * 
         */
        public Builder patchingEndTime(@Nullable Output<String> patchingEndTime) {
            $.patchingEndTime = patchingEndTime;
            return this;
        }

        /**
         * @param patchingEndTime The time when the patching operation ended.
         * 
         * @return builder
         * 
         */
        public Builder patchingEndTime(String patchingEndTime) {
            return patchingEndTime(Output.of(patchingEndTime));
        }

        /**
         * @param patchingMode (Updatable) Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
         * 
         * @return builder
         * 
         */
        public Builder patchingMode(@Nullable Output<String> patchingMode) {
            $.patchingMode = patchingMode;
            return this;
        }

        /**
         * @param patchingMode (Updatable) Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
         * 
         * @return builder
         * 
         */
        public Builder patchingMode(String patchingMode) {
            return patchingMode(Output.of(patchingMode));
        }

        /**
         * @param patchingStartTime The time when the patching operation started.
         * 
         * @return builder
         * 
         */
        public Builder patchingStartTime(@Nullable Output<String> patchingStartTime) {
            $.patchingStartTime = patchingStartTime;
            return this;
        }

        /**
         * @param patchingStartTime The time when the patching operation started.
         * 
         * @return builder
         * 
         */
        public Builder patchingStartTime(String patchingStartTime) {
            return patchingStartTime(Output.of(patchingStartTime));
        }

        /**
         * @param patchingStatus The status of the patching operation.
         * 
         * @return builder
         * 
         */
        public Builder patchingStatus(@Nullable Output<String> patchingStatus) {
            $.patchingStatus = patchingStatus;
            return this;
        }

        /**
         * @param patchingStatus The status of the patching operation.
         * 
         * @return builder
         * 
         */
        public Builder patchingStatus(String patchingStatus) {
            return patchingStatus(Output.of(patchingStatus));
        }

        /**
         * @param peerMaintenanceRunId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association&#39;s peer container database.
         * 
         * @return builder
         * 
         */
        public Builder peerMaintenanceRunId(@Nullable Output<String> peerMaintenanceRunId) {
            $.peerMaintenanceRunId = peerMaintenanceRunId;
            return this;
        }

        /**
         * @param peerMaintenanceRunId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association&#39;s peer container database.
         * 
         * @return builder
         * 
         */
        public Builder peerMaintenanceRunId(String peerMaintenanceRunId) {
            return peerMaintenanceRunId(Output.of(peerMaintenanceRunId));
        }

        /**
         * @param state The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param targetDbServerVersion The target software version for the database server patching operation.
         * 
         * @return builder
         * 
         */
        public Builder targetDbServerVersion(@Nullable Output<String> targetDbServerVersion) {
            $.targetDbServerVersion = targetDbServerVersion;
            return this;
        }

        /**
         * @param targetDbServerVersion The target software version for the database server patching operation.
         * 
         * @return builder
         * 
         */
        public Builder targetDbServerVersion(String targetDbServerVersion) {
            return targetDbServerVersion(Output.of(targetDbServerVersion));
        }

        /**
         * @param targetResourceId The ID of the target resource on which the maintenance run occurs.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * @param targetResourceId The ID of the target resource on which the maintenance run occurs.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        /**
         * @param targetResourceType The type of the target resource on which the maintenance run occurs.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable Output<String> targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        /**
         * @param targetResourceType The type of the target resource on which the maintenance run occurs.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(String targetResourceType) {
            return targetResourceType(Output.of(targetResourceType));
        }

        /**
         * @param targetStorageServerVersion The target Cell version that is to be patched to.
         * 
         * @return builder
         * 
         */
        public Builder targetStorageServerVersion(@Nullable Output<String> targetStorageServerVersion) {
            $.targetStorageServerVersion = targetStorageServerVersion;
            return this;
        }

        /**
         * @param targetStorageServerVersion The target Cell version that is to be patched to.
         * 
         * @return builder
         * 
         */
        public Builder targetStorageServerVersion(String targetStorageServerVersion) {
            return targetStorageServerVersion(Output.of(targetStorageServerVersion));
        }

        /**
         * @param timeEnded The date and time the maintenance run was completed.
         * 
         * @return builder
         * 
         */
        public Builder timeEnded(@Nullable Output<String> timeEnded) {
            $.timeEnded = timeEnded;
            return this;
        }

        /**
         * @param timeEnded The date and time the maintenance run was completed.
         * 
         * @return builder
         * 
         */
        public Builder timeEnded(String timeEnded) {
            return timeEnded(Output.of(timeEnded));
        }

        /**
         * @param timeScheduled (Updatable) The scheduled date and time of the maintenance run to update.
         * 
         * @return builder
         * 
         */
        public Builder timeScheduled(@Nullable Output<String> timeScheduled) {
            $.timeScheduled = timeScheduled;
            return this;
        }

        /**
         * @param timeScheduled (Updatable) The scheduled date and time of the maintenance run to update.
         * 
         * @return builder
         * 
         */
        public Builder timeScheduled(String timeScheduled) {
            return timeScheduled(Output.of(timeScheduled));
        }

        /**
         * @param timeStarted The date and time the maintenance run starts.
         * 
         * @return builder
         * 
         */
        public Builder timeStarted(@Nullable Output<String> timeStarted) {
            $.timeStarted = timeStarted;
            return this;
        }

        /**
         * @param timeStarted The date and time the maintenance run starts.
         * 
         * @return builder
         * 
         */
        public Builder timeStarted(String timeStarted) {
            return timeStarted(Output.of(timeStarted));
        }

        public MaintenanceRunState build() {
            return $;
        }
    }

}
