// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogStorageSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogStorageSettingsArgs Empty = new LogStorageSettingsArgs();

    @InputImport(name="enableReliableLogging")
    private final @Nullable Input<Object> enableReliableLogging;

    public Input<Object> getEnableReliableLogging() {
        return this.enableReliableLogging == null ? Input.empty() : this.enableReliableLogging;
    }

    @InputImport(name="linkedServiceName", required=true)
    private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    @InputImport(name="logLevel")
    private final @Nullable Input<Object> logLevel;

    public Input<Object> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    @InputImport(name="path")
    private final @Nullable Input<Object> path;

    public Input<Object> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public LogStorageSettingsArgs(
        @Nullable Input<Object> enableReliableLogging,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Object> logLevel,
        @Nullable Input<Object> path) {
        this.enableReliableLogging = enableReliableLogging;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.logLevel = logLevel;
        this.path = path;
    }

    private LogStorageSettingsArgs() {
        this.enableReliableLogging = Input.empty();
        this.linkedServiceName = Input.empty();
        this.logLevel = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStorageSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> enableReliableLogging;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Object> logLevel;
        private @Nullable Input<Object> path;

        public Builder() {
    	      // Empty
        }

        public Builder(LogStorageSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableReliableLogging = defaults.enableReliableLogging;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logLevel = defaults.logLevel;
    	      this.path = defaults.path;
        }

        public Builder setEnableReliableLogging(@Nullable Input<Object> enableReliableLogging) {
            this.enableReliableLogging = enableReliableLogging;
            return this;
        }

        public Builder setEnableReliableLogging(@Nullable Object enableReliableLogging) {
            this.enableReliableLogging = Input.ofNullable(enableReliableLogging);
            return this;
        }

        public Builder setLinkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder setLogLevel(@Nullable Input<Object> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable Object logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }

        public Builder setPath(@Nullable Input<Object> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public LogStorageSettingsArgs build() {
            return new LogStorageSettingsArgs(enableReliableLogging, linkedServiceName, logLevel, path);
        }
    }
}
