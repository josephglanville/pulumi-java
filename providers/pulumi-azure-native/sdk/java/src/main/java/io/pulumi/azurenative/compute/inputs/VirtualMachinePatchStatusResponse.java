// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.AvailablePatchSummaryResponse;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.inputs.LastPatchInstallationSummaryResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachinePatchStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachinePatchStatusResponse Empty = new VirtualMachinePatchStatusResponse();

    @InputImport(name="availablePatchSummary")
    private final @Nullable AvailablePatchSummaryResponse availablePatchSummary;

    public Optional<AvailablePatchSummaryResponse> getAvailablePatchSummary() {
        return this.availablePatchSummary == null ? Optional.empty() : Optional.ofNullable(this.availablePatchSummary);
    }

    @InputImport(name="configurationStatuses", required=true)
    private final List<InstanceViewStatusResponse> configurationStatuses;

    public List<InstanceViewStatusResponse> getConfigurationStatuses() {
        return this.configurationStatuses;
    }

    @InputImport(name="lastPatchInstallationSummary")
    private final @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary;

    public Optional<LastPatchInstallationSummaryResponse> getLastPatchInstallationSummary() {
        return this.lastPatchInstallationSummary == null ? Optional.empty() : Optional.ofNullable(this.lastPatchInstallationSummary);
    }

    public VirtualMachinePatchStatusResponse(
        @Nullable AvailablePatchSummaryResponse availablePatchSummary,
        List<InstanceViewStatusResponse> configurationStatuses,
        @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary) {
        this.availablePatchSummary = availablePatchSummary;
        this.configurationStatuses = Objects.requireNonNull(configurationStatuses, "expected parameter 'configurationStatuses' to be non-null");
        this.lastPatchInstallationSummary = lastPatchInstallationSummary;
    }

    private VirtualMachinePatchStatusResponse() {
        this.availablePatchSummary = null;
        this.configurationStatuses = List.of();
        this.lastPatchInstallationSummary = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePatchStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AvailablePatchSummaryResponse availablePatchSummary;
        private List<InstanceViewStatusResponse> configurationStatuses;
        private @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePatchStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availablePatchSummary = defaults.availablePatchSummary;
    	      this.configurationStatuses = defaults.configurationStatuses;
    	      this.lastPatchInstallationSummary = defaults.lastPatchInstallationSummary;
        }

        public Builder setAvailablePatchSummary(@Nullable AvailablePatchSummaryResponse availablePatchSummary) {
            this.availablePatchSummary = availablePatchSummary;
            return this;
        }

        public Builder setConfigurationStatuses(List<InstanceViewStatusResponse> configurationStatuses) {
            this.configurationStatuses = Objects.requireNonNull(configurationStatuses);
            return this;
        }

        public Builder setLastPatchInstallationSummary(@Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary) {
            this.lastPatchInstallationSummary = lastPatchInstallationSummary;
            return this;
        }

        public VirtualMachinePatchStatusResponse build() {
            return new VirtualMachinePatchStatusResponse(availablePatchSummary, configurationStatuses, lastPatchInstallationSummary);
        }
    }
}
