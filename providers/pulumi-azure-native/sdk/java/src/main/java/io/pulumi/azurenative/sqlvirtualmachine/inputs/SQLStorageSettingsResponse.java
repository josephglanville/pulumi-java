// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set disk storage settings for SQL Server.
 * 
 */
public final class SQLStorageSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SQLStorageSettingsResponse Empty = new SQLStorageSettingsResponse();

    /**
     * SQL Server default file path
     * 
     */
    @InputImport(name="defaultFilePath")
      private final @Nullable String defaultFilePath;

    public Optional<String> getDefaultFilePath() {
        return this.defaultFilePath == null ? Optional.empty() : Optional.ofNullable(this.defaultFilePath);
    }

    /**
     * Logical Unit Numbers for the disks.
     * 
     */
    @InputImport(name="luns")
      private final @Nullable List<Integer> luns;

    public List<Integer> getLuns() {
        return this.luns == null ? List.of() : this.luns;
    }

    public SQLStorageSettingsResponse(
        @Nullable String defaultFilePath,
        @Nullable List<Integer> luns) {
        this.defaultFilePath = defaultFilePath;
        this.luns = luns;
    }

    private SQLStorageSettingsResponse() {
        this.defaultFilePath = null;
        this.luns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SQLStorageSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultFilePath;
        private @Nullable List<Integer> luns;

        public Builder() {
    	      // Empty
        }

        public Builder(SQLStorageSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultFilePath = defaults.defaultFilePath;
    	      this.luns = defaults.luns;
        }

        public Builder setDefaultFilePath(@Nullable String defaultFilePath) {
            this.defaultFilePath = defaultFilePath;
            return this;
        }

        public Builder setLuns(@Nullable List<Integer> luns) {
            this.luns = luns;
            return this;
        }
        public SQLStorageSettingsResponse build() {
            return new SQLStorageSettingsResponse(defaultFilePath, luns);
        }
    }
}
