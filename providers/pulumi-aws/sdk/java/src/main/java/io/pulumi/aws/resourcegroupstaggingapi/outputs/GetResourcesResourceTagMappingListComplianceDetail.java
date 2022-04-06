// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroupstaggingapi.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourcesResourceTagMappingListComplianceDetail {
    /**
     * Whether the resource is compliant.
     * * ` keys_with_noncompliant_values  ` - Set of tag keys with non-compliant tag values.
     * * ` non_compliant_keys  ` - Set of non-compliant tag keys.
     * 
     */
    private final Boolean complianceStatus;
    private final List<String> keysWithNoncompliantValues;
    private final List<String> nonCompliantKeys;

    @CustomType.Constructor
    private GetResourcesResourceTagMappingListComplianceDetail(
        @CustomType.Parameter("complianceStatus") Boolean complianceStatus,
        @CustomType.Parameter("keysWithNoncompliantValues") List<String> keysWithNoncompliantValues,
        @CustomType.Parameter("nonCompliantKeys") List<String> nonCompliantKeys) {
        this.complianceStatus = complianceStatus;
        this.keysWithNoncompliantValues = keysWithNoncompliantValues;
        this.nonCompliantKeys = nonCompliantKeys;
    }

    /**
     * Whether the resource is compliant.
     * * ` keys_with_noncompliant_values  ` - Set of tag keys with non-compliant tag values.
     * * ` non_compliant_keys  ` - Set of non-compliant tag keys.
     * 
    */
    public Boolean getComplianceStatus() {
        return this.complianceStatus;
    }
    public List<String> getKeysWithNoncompliantValues() {
        return this.keysWithNoncompliantValues;
    }
    public List<String> getNonCompliantKeys() {
        return this.nonCompliantKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesResourceTagMappingListComplianceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean complianceStatus;
        private List<String> keysWithNoncompliantValues;
        private List<String> nonCompliantKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesResourceTagMappingListComplianceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.keysWithNoncompliantValues = defaults.keysWithNoncompliantValues;
    	      this.nonCompliantKeys = defaults.nonCompliantKeys;
        }

        public Builder complianceStatus(Boolean complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }
        public Builder keysWithNoncompliantValues(List<String> keysWithNoncompliantValues) {
            this.keysWithNoncompliantValues = Objects.requireNonNull(keysWithNoncompliantValues);
            return this;
        }
        public Builder keysWithNoncompliantValues(String... keysWithNoncompliantValues) {
            return keysWithNoncompliantValues(List.of(keysWithNoncompliantValues));
        }
        public Builder nonCompliantKeys(List<String> nonCompliantKeys) {
            this.nonCompliantKeys = Objects.requireNonNull(nonCompliantKeys);
            return this;
        }
        public Builder nonCompliantKeys(String... nonCompliantKeys) {
            return nonCompliantKeys(List.of(nonCompliantKeys));
        }        public GetResourcesResourceTagMappingListComplianceDetail build() {
            return new GetResourcesResourceTagMappingListComplianceDetail(complianceStatus, keysWithNoncompliantValues, nonCompliantKeys);
        }
    }
}