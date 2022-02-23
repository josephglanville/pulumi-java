// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sftp write settings.
 * 
 */
public final class SftpWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SftpWriteSettingsArgs Empty = new SftpWriteSettingsArgs();

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @InputImport(name="copyBehavior")
      private final @Nullable Input<Object> copyBehavior;

    public Input<Object> getCopyBehavior() {
        return this.copyBehavior == null ? Input.empty() : this.copyBehavior;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
      private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * Specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="operationTimeout")
      private final @Nullable Input<Object> operationTimeout;

    public Input<Object> getOperationTimeout() {
        return this.operationTimeout == null ? Input.empty() : this.operationTimeout;
    }

    /**
     * The write setting type.
     * Expected value is 'SftpWriteSettings'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Upload to temporary file(s) and rename. Disable this option if your SFTP server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="useTempFileRename")
      private final @Nullable Input<Object> useTempFileRename;

    public Input<Object> getUseTempFileRename() {
        return this.useTempFileRename == null ? Input.empty() : this.useTempFileRename;
    }

    public SftpWriteSettingsArgs(
        @Nullable Input<Object> copyBehavior,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> operationTimeout,
        Input<String> type,
        @Nullable Input<Object> useTempFileRename) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.operationTimeout = operationTimeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useTempFileRename = useTempFileRename;
    }

    private SftpWriteSettingsArgs() {
        this.copyBehavior = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.operationTimeout = Input.empty();
        this.type = Input.empty();
        this.useTempFileRename = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> copyBehavior;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> operationTimeout;
        private Input<String> type;
        private @Nullable Input<Object> useTempFileRename;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.operationTimeout = defaults.operationTimeout;
    	      this.type = defaults.type;
    	      this.useTempFileRename = defaults.useTempFileRename;
        }

        public Builder setCopyBehavior(@Nullable Input<Object> copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }

        public Builder setCopyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = Input.ofNullable(copyBehavior);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setOperationTimeout(@Nullable Input<Object> operationTimeout) {
            this.operationTimeout = operationTimeout;
            return this;
        }

        public Builder setOperationTimeout(@Nullable Object operationTimeout) {
            this.operationTimeout = Input.ofNullable(operationTimeout);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUseTempFileRename(@Nullable Input<Object> useTempFileRename) {
            this.useTempFileRename = useTempFileRename;
            return this;
        }

        public Builder setUseTempFileRename(@Nullable Object useTempFileRename) {
            this.useTempFileRename = Input.ofNullable(useTempFileRename);
            return this;
        }
        public SftpWriteSettingsArgs build() {
            return new SftpWriteSettingsArgs(copyBehavior, disableMetricsCollection, maxConcurrentConnections, operationTimeout, type, useTempFileRename);
        }
    }
}
