// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1.inputs.AttributeResponse;
import io.pulumi.googlenative.healthcare_v1.inputs.ExprResponse;
import java.util.List;
import java.util.Objects;


/**
 * Represents a user's consent in terms of the resources that can be accessed and under what conditions.
 * 
 */
public final class GoogleCloudHealthcareV1ConsentPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudHealthcareV1ConsentPolicyResponse Empty = new GoogleCloudHealthcareV1ConsentPolicyResponse();

    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&&`), `OR` (`||`).
     * 
     */
    @Import(name="authorizationRule", required=true)
      private final ExprResponse authorizationRule;

    public ExprResponse getAuthorizationRule() {
        return this.authorizationRule;
    }

    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
     */
    @Import(name="resourceAttributes", required=true)
      private final List<AttributeResponse> resourceAttributes;

    public List<AttributeResponse> getResourceAttributes() {
        return this.resourceAttributes;
    }

    public GoogleCloudHealthcareV1ConsentPolicyResponse(
        ExprResponse authorizationRule,
        List<AttributeResponse> resourceAttributes) {
        this.authorizationRule = Objects.requireNonNull(authorizationRule, "expected parameter 'authorizationRule' to be non-null");
        this.resourceAttributes = Objects.requireNonNull(resourceAttributes, "expected parameter 'resourceAttributes' to be non-null");
    }

    private GoogleCloudHealthcareV1ConsentPolicyResponse() {
        this.authorizationRule = null;
        this.resourceAttributes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1ConsentPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse authorizationRule;
        private List<AttributeResponse> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1ConsentPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRule = defaults.authorizationRule;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder authorizationRule(ExprResponse authorizationRule) {
            this.authorizationRule = Objects.requireNonNull(authorizationRule);
            return this;
        }
        public Builder resourceAttributes(List<AttributeResponse> resourceAttributes) {
            this.resourceAttributes = Objects.requireNonNull(resourceAttributes);
            return this;
        }
        public Builder resourceAttributes(AttributeResponse... resourceAttributes) {
            return resourceAttributes(List.of(resourceAttributes));
        }        public GoogleCloudHealthcareV1ConsentPolicyResponse build() {
            return new GoogleCloudHealthcareV1ConsentPolicyResponse(authorizationRule, resourceAttributes);
        }
    }
}
