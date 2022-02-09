// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.CopyActivityLogSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.LogLocationSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogSettingsResponse Empty = new LogSettingsResponse();

    @InputImport(name="copyActivityLogSettings")
    private final @Nullable CopyActivityLogSettingsResponse copyActivityLogSettings;

    public Optional<CopyActivityLogSettingsResponse> getCopyActivityLogSettings() {
        return this.copyActivityLogSettings == null ? Optional.empty() : Optional.ofNullable(this.copyActivityLogSettings);
    }

    @InputImport(name="enableCopyActivityLog")
    private final @Nullable Object enableCopyActivityLog;

    public Optional<Object> getEnableCopyActivityLog() {
        return this.enableCopyActivityLog == null ? Optional.empty() : Optional.ofNullable(this.enableCopyActivityLog);
    }

    @InputImport(name="logLocationSettings", required=true)
    private final LogLocationSettingsResponse logLocationSettings;

    public LogLocationSettingsResponse getLogLocationSettings() {
        return this.logLocationSettings;
    }

    public LogSettingsResponse(
        @Nullable CopyActivityLogSettingsResponse copyActivityLogSettings,
        @Nullable Object enableCopyActivityLog,
        LogLocationSettingsResponse logLocationSettings) {
        this.copyActivityLogSettings = copyActivityLogSettings;
        this.enableCopyActivityLog = enableCopyActivityLog;
        this.logLocationSettings = Objects.requireNonNull(logLocationSettings, "expected parameter 'logLocationSettings' to be non-null");
    }

    private LogSettingsResponse() {
        this.copyActivityLogSettings = null;
        this.enableCopyActivityLog = null;
        this.logLocationSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CopyActivityLogSettingsResponse copyActivityLogSettings;
        private @Nullable Object enableCopyActivityLog;
        private LogLocationSettingsResponse logLocationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyActivityLogSettings = defaults.copyActivityLogSettings;
    	      this.enableCopyActivityLog = defaults.enableCopyActivityLog;
    	      this.logLocationSettings = defaults.logLocationSettings;
        }

        public Builder setCopyActivityLogSettings(@Nullable CopyActivityLogSettingsResponse copyActivityLogSettings) {
            this.copyActivityLogSettings = copyActivityLogSettings;
            return this;
        }

        public Builder setEnableCopyActivityLog(@Nullable Object enableCopyActivityLog) {
            this.enableCopyActivityLog = enableCopyActivityLog;
            return this;
        }

        public Builder setLogLocationSettings(LogLocationSettingsResponse logLocationSettings) {
            this.logLocationSettings = Objects.requireNonNull(logLocationSettings);
            return this;
        }

        public LogSettingsResponse build() {
            return new LogSettingsResponse(copyActivityLogSettings, enableCopyActivityLog, logLocationSettings);
        }
    }
}
