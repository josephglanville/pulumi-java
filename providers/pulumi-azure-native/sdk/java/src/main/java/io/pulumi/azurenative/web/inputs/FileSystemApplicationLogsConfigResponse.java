// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application logs to file system configuration.
 * 
 */
public final class FileSystemApplicationLogsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileSystemApplicationLogsConfigResponse Empty = new FileSystemApplicationLogsConfigResponse();

    /**
     * Log level.
     * 
     */
    @Import(name="level")
      private final @Nullable String level;

    public Optional<String> getLevel() {
        return this.level == null ? Optional.empty() : Optional.ofNullable(this.level);
    }

    public FileSystemApplicationLogsConfigResponse(@Nullable String level) {
        this.level = level == null ? "Off" : level;
    }

    private FileSystemApplicationLogsConfigResponse() {
        this.level = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemApplicationLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String level;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemApplicationLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
        }

        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }        public FileSystemApplicationLogsConfigResponse build() {
            return new FileSystemApplicationLogsConfigResponse(level);
        }
    }
}
