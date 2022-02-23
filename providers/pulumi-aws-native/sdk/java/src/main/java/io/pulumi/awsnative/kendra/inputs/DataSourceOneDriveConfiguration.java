// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceOneDriveUsers;
import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceOneDriveConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceOneDriveConfiguration Empty = new DataSourceOneDriveConfiguration();

    @InputImport(name="disableLocalGroups")
      private final @Nullable Boolean disableLocalGroups;

    public Optional<Boolean> getDisableLocalGroups() {
        return this.disableLocalGroups == null ? Optional.empty() : Optional.ofNullable(this.disableLocalGroups);
    }

    @InputImport(name="exclusionPatterns")
      private final @Nullable List<String> exclusionPatterns;

    public List<String> getExclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }

    @InputImport(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    @InputImport(name="inclusionPatterns")
      private final @Nullable List<String> inclusionPatterns;

    public List<String> getInclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }

    @InputImport(name="oneDriveUsers", required=true)
      private final DataSourceOneDriveUsers oneDriveUsers;

    public DataSourceOneDriveUsers getOneDriveUsers() {
        return this.oneDriveUsers;
    }

    @InputImport(name="secretArn", required=true)
      private final String secretArn;

    public String getSecretArn() {
        return this.secretArn;
    }

    @InputImport(name="tenantDomain", required=true)
      private final String tenantDomain;

    public String getTenantDomain() {
        return this.tenantDomain;
    }

    public DataSourceOneDriveConfiguration(
        @Nullable Boolean disableLocalGroups,
        @Nullable List<String> exclusionPatterns,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable List<String> inclusionPatterns,
        DataSourceOneDriveUsers oneDriveUsers,
        String secretArn,
        String tenantDomain) {
        this.disableLocalGroups = disableLocalGroups;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.oneDriveUsers = Objects.requireNonNull(oneDriveUsers, "expected parameter 'oneDriveUsers' to be non-null");
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.tenantDomain = Objects.requireNonNull(tenantDomain, "expected parameter 'tenantDomain' to be non-null");
    }

    private DataSourceOneDriveConfiguration() {
        this.disableLocalGroups = null;
        this.exclusionPatterns = List.of();
        this.fieldMappings = List.of();
        this.inclusionPatterns = List.of();
        this.oneDriveUsers = null;
        this.secretArn = null;
        this.tenantDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceOneDriveConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableLocalGroups;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private DataSourceOneDriveUsers oneDriveUsers;
        private String secretArn;
        private String tenantDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceOneDriveConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocalGroups = defaults.disableLocalGroups;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.oneDriveUsers = defaults.oneDriveUsers;
    	      this.secretArn = defaults.secretArn;
    	      this.tenantDomain = defaults.tenantDomain;
        }

        public Builder setDisableLocalGroups(@Nullable Boolean disableLocalGroups) {
            this.disableLocalGroups = disableLocalGroups;
            return this;
        }

        public Builder setExclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setInclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder setOneDriveUsers(DataSourceOneDriveUsers oneDriveUsers) {
            this.oneDriveUsers = Objects.requireNonNull(oneDriveUsers);
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder setTenantDomain(String tenantDomain) {
            this.tenantDomain = Objects.requireNonNull(tenantDomain);
            return this;
        }
        public DataSourceOneDriveConfiguration build() {
            return new DataSourceOneDriveConfiguration(disableLocalGroups, exclusionPatterns, fieldMappings, inclusionPatterns, oneDriveUsers, secretArn, tenantDomain);
        }
    }
}
