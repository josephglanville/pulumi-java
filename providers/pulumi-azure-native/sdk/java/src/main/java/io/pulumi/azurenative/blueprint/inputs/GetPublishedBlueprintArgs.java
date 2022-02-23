// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPublishedBlueprintArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPublishedBlueprintArgs Empty = new GetPublishedBlueprintArgs();

    /**
     * Name of the blueprint definition.
     * 
     */
    @InputImport(name="blueprintName", required=true)
      private final String blueprintName;

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @InputImport(name="resourceScope", required=true)
      private final String resourceScope;

    public String getResourceScope() {
        return this.resourceScope;
    }

    /**
     * Version of the published blueprint definition.
     * 
     */
    @InputImport(name="versionId", required=true)
      private final String versionId;

    public String getVersionId() {
        return this.versionId;
    }

    public GetPublishedBlueprintArgs(
        String blueprintName,
        String resourceScope,
        String versionId) {
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
    }

    private GetPublishedBlueprintArgs() {
        this.blueprintName = null;
        this.resourceScope = null;
        this.versionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublishedBlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blueprintName;
        private String resourceScope;
        private String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublishedBlueprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.resourceScope = defaults.resourceScope;
    	      this.versionId = defaults.versionId;
        }

        public Builder setBlueprintName(String blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }

        public Builder setResourceScope(String resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }

        public Builder setVersionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        public GetPublishedBlueprintArgs build() {
            return new GetPublishedBlueprintArgs(blueprintName, resourceScope, versionId);
        }
    }
}
