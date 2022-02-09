// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.LinuxOsInfoResponse;
import io.pulumi.azurenative.devtestlab.inputs.WindowsOsInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomImagePropertiesFromVmResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomImagePropertiesFromVmResponse Empty = new CustomImagePropertiesFromVmResponse();

    @InputImport(name="linuxOsInfo")
    private final @Nullable LinuxOsInfoResponse linuxOsInfo;

    public Optional<LinuxOsInfoResponse> getLinuxOsInfo() {
        return this.linuxOsInfo == null ? Optional.empty() : Optional.ofNullable(this.linuxOsInfo);
    }

    @InputImport(name="sourceVmId")
    private final @Nullable String sourceVmId;

    public Optional<String> getSourceVmId() {
        return this.sourceVmId == null ? Optional.empty() : Optional.ofNullable(this.sourceVmId);
    }

    @InputImport(name="windowsOsInfo")
    private final @Nullable WindowsOsInfoResponse windowsOsInfo;

    public Optional<WindowsOsInfoResponse> getWindowsOsInfo() {
        return this.windowsOsInfo == null ? Optional.empty() : Optional.ofNullable(this.windowsOsInfo);
    }

    public CustomImagePropertiesFromVmResponse(
        @Nullable LinuxOsInfoResponse linuxOsInfo,
        @Nullable String sourceVmId,
        @Nullable WindowsOsInfoResponse windowsOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        this.sourceVmId = sourceVmId;
        this.windowsOsInfo = windowsOsInfo;
    }

    private CustomImagePropertiesFromVmResponse() {
        this.linuxOsInfo = null;
        this.sourceVmId = null;
        this.windowsOsInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxOsInfoResponse linuxOsInfo;
        private @Nullable String sourceVmId;
        private @Nullable WindowsOsInfoResponse windowsOsInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromVmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxOsInfo = defaults.linuxOsInfo;
    	      this.sourceVmId = defaults.sourceVmId;
    	      this.windowsOsInfo = defaults.windowsOsInfo;
        }

        public Builder setLinuxOsInfo(@Nullable LinuxOsInfoResponse linuxOsInfo) {
            this.linuxOsInfo = linuxOsInfo;
            return this;
        }

        public Builder setSourceVmId(@Nullable String sourceVmId) {
            this.sourceVmId = sourceVmId;
            return this;
        }

        public Builder setWindowsOsInfo(@Nullable WindowsOsInfoResponse windowsOsInfo) {
            this.windowsOsInfo = windowsOsInfo;
            return this;
        }

        public CustomImagePropertiesFromVmResponse build() {
            return new CustomImagePropertiesFromVmResponse(linuxOsInfo, sourceVmId, windowsOsInfo);
        }
    }
}
