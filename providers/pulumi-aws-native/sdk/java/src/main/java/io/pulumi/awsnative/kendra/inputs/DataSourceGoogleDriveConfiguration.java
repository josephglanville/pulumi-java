// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceGoogleDriveConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceGoogleDriveConfiguration Empty = new DataSourceGoogleDriveConfiguration();

    @Import(name="excludeMimeTypes")
      private final @Nullable List<String> excludeMimeTypes;

    public List<String> getExcludeMimeTypes() {
        return this.excludeMimeTypes == null ? List.of() : this.excludeMimeTypes;
    }

    @Import(name="excludeSharedDrives")
      private final @Nullable List<String> excludeSharedDrives;

    public List<String> getExcludeSharedDrives() {
        return this.excludeSharedDrives == null ? List.of() : this.excludeSharedDrives;
    }

    @Import(name="excludeUserAccounts")
      private final @Nullable List<String> excludeUserAccounts;

    public List<String> getExcludeUserAccounts() {
        return this.excludeUserAccounts == null ? List.of() : this.excludeUserAccounts;
    }

    @Import(name="exclusionPatterns")
      private final @Nullable List<String> exclusionPatterns;

    public List<String> getExclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }

    @Import(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    @Import(name="inclusionPatterns")
      private final @Nullable List<String> inclusionPatterns;

    public List<String> getInclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }

    @Import(name="secretArn", required=true)
      private final String secretArn;

    public String getSecretArn() {
        return this.secretArn;
    }

    public DataSourceGoogleDriveConfiguration(
        @Nullable List<String> excludeMimeTypes,
        @Nullable List<String> excludeSharedDrives,
        @Nullable List<String> excludeUserAccounts,
        @Nullable List<String> exclusionPatterns,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable List<String> inclusionPatterns,
        String secretArn) {
        this.excludeMimeTypes = excludeMimeTypes;
        this.excludeSharedDrives = excludeSharedDrives;
        this.excludeUserAccounts = excludeUserAccounts;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
    }

    private DataSourceGoogleDriveConfiguration() {
        this.excludeMimeTypes = List.of();
        this.excludeSharedDrives = List.of();
        this.excludeUserAccounts = List.of();
        this.exclusionPatterns = List.of();
        this.fieldMappings = List.of();
        this.inclusionPatterns = List.of();
        this.secretArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceGoogleDriveConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludeMimeTypes;
        private @Nullable List<String> excludeSharedDrives;
        private @Nullable List<String> excludeUserAccounts;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceGoogleDriveConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeMimeTypes = defaults.excludeMimeTypes;
    	      this.excludeSharedDrives = defaults.excludeSharedDrives;
    	      this.excludeUserAccounts = defaults.excludeUserAccounts;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder excludeMimeTypes(@Nullable List<String> excludeMimeTypes) {
            this.excludeMimeTypes = excludeMimeTypes;
            return this;
        }
        public Builder excludeMimeTypes(String... excludeMimeTypes) {
            return excludeMimeTypes(List.of(excludeMimeTypes));
        }
        public Builder excludeSharedDrives(@Nullable List<String> excludeSharedDrives) {
            this.excludeSharedDrives = excludeSharedDrives;
            return this;
        }
        public Builder excludeSharedDrives(String... excludeSharedDrives) {
            return excludeSharedDrives(List.of(excludeSharedDrives));
        }
        public Builder excludeUserAccounts(@Nullable List<String> excludeUserAccounts) {
            this.excludeUserAccounts = excludeUserAccounts;
            return this;
        }
        public Builder excludeUserAccounts(String... excludeUserAccounts) {
            return excludeUserAccounts(List.of(excludeUserAccounts));
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }        public DataSourceGoogleDriveConfiguration build() {
            return new DataSourceGoogleDriveConfiguration(excludeMimeTypes, excludeSharedDrives, excludeUserAccounts, exclusionPatterns, fieldMappings, inclusionPatterns, secretArn);
        }
    }
}
