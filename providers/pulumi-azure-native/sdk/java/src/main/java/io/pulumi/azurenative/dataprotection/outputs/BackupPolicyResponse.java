// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.AzureBackupRuleResponse;
import io.pulumi.azurenative.dataprotection.outputs.AzureRetentionRuleResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BackupPolicyResponse {
    private final List<String> datasourceTypes;
    private final String objectType;
    private final List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

    @OutputCustomType.Constructor({"datasourceTypes","objectType","policyRules"})
    private BackupPolicyResponse(
        List<String> datasourceTypes,
        String objectType,
        List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
        this.datasourceTypes = Objects.requireNonNull(datasourceTypes);
        this.objectType = Objects.requireNonNull(objectType);
        this.policyRules = Objects.requireNonNull(policyRules);
    }

    public List<String> getDatasourceTypes() {
        return this.datasourceTypes;
    }
    public String getObjectType() {
        return this.objectType;
    }
    public List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> getPolicyRules() {
        return this.policyRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> datasourceTypes;
        private String objectType;
        private List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceTypes = defaults.datasourceTypes;
    	      this.objectType = defaults.objectType;
    	      this.policyRules = defaults.policyRules;
        }

        public Builder setDatasourceTypes(List<String> datasourceTypes) {
            this.datasourceTypes = Objects.requireNonNull(datasourceTypes);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setPolicyRules(List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
            this.policyRules = Objects.requireNonNull(policyRules);
            return this;
        }

        public BackupPolicyResponse build() {
            return new BackupPolicyResponse(datasourceTypes, objectType, policyRules);
        }
    }
}
