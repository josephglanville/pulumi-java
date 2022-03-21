// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudasset_v1.outputs.AccessSelectorResponse;
import io.pulumi.googlenative.cloudasset_v1.outputs.ConditionContextResponse;
import io.pulumi.googlenative.cloudasset_v1.outputs.IdentitySelectorResponse;
import io.pulumi.googlenative.cloudasset_v1.outputs.OptionsResponse;
import io.pulumi.googlenative.cloudasset_v1.outputs.ResourceSelectorResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IamPolicyAnalysisQueryResponse {
    /**
     * Optional. Specifies roles or permissions for analysis. This is optional.
     * 
     */
    private final AccessSelectorResponse accessSelector;
    /**
     * Optional. The hypothetical context for IAM conditions evaluation.
     * 
     */
    private final ConditionContextResponse conditionContext;
    /**
     * Optional. Specifies an identity for analysis.
     * 
     */
    private final IdentitySelectorResponse identitySelector;
    /**
     * Optional. The query options.
     * 
     */
    private final OptionsResponse options;
    /**
     * Optional. Specifies a resource for analysis.
     * 
     */
    private final ResourceSelectorResponse resourceSelector;
    /**
     * The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * 
     */
    private final String scope;

    @CustomType.Constructor
    private IamPolicyAnalysisQueryResponse(
        @CustomType.Parameter("accessSelector") AccessSelectorResponse accessSelector,
        @CustomType.Parameter("conditionContext") ConditionContextResponse conditionContext,
        @CustomType.Parameter("identitySelector") IdentitySelectorResponse identitySelector,
        @CustomType.Parameter("options") OptionsResponse options,
        @CustomType.Parameter("resourceSelector") ResourceSelectorResponse resourceSelector,
        @CustomType.Parameter("scope") String scope) {
        this.accessSelector = accessSelector;
        this.conditionContext = conditionContext;
        this.identitySelector = identitySelector;
        this.options = options;
        this.resourceSelector = resourceSelector;
        this.scope = scope;
    }

    /**
     * Optional. Specifies roles or permissions for analysis. This is optional.
     * 
    */
    public AccessSelectorResponse getAccessSelector() {
        return this.accessSelector;
    }
    /**
     * Optional. The hypothetical context for IAM conditions evaluation.
     * 
    */
    public ConditionContextResponse getConditionContext() {
        return this.conditionContext;
    }
    /**
     * Optional. Specifies an identity for analysis.
     * 
    */
    public IdentitySelectorResponse getIdentitySelector() {
        return this.identitySelector;
    }
    /**
     * Optional. The query options.
     * 
    */
    public OptionsResponse getOptions() {
        return this.options;
    }
    /**
     * Optional. Specifies a resource for analysis.
     * 
    */
    public ResourceSelectorResponse getResourceSelector() {
        return this.resourceSelector;
    }
    /**
     * The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * 
    */
    public String getScope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamPolicyAnalysisQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessSelectorResponse accessSelector;
        private ConditionContextResponse conditionContext;
        private IdentitySelectorResponse identitySelector;
        private OptionsResponse options;
        private ResourceSelectorResponse resourceSelector;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(IamPolicyAnalysisQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessSelector = defaults.accessSelector;
    	      this.conditionContext = defaults.conditionContext;
    	      this.identitySelector = defaults.identitySelector;
    	      this.options = defaults.options;
    	      this.resourceSelector = defaults.resourceSelector;
    	      this.scope = defaults.scope;
        }

        public Builder accessSelector(AccessSelectorResponse accessSelector) {
            this.accessSelector = Objects.requireNonNull(accessSelector);
            return this;
        }
        public Builder conditionContext(ConditionContextResponse conditionContext) {
            this.conditionContext = Objects.requireNonNull(conditionContext);
            return this;
        }
        public Builder identitySelector(IdentitySelectorResponse identitySelector) {
            this.identitySelector = Objects.requireNonNull(identitySelector);
            return this;
        }
        public Builder options(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder resourceSelector(ResourceSelectorResponse resourceSelector) {
            this.resourceSelector = Objects.requireNonNull(resourceSelector);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public IamPolicyAnalysisQueryResponse build() {
            return new IamPolicyAnalysisQueryResponse(accessSelector, conditionContext, identitySelector, options, resourceSelector, scope);
        }
    }
}
