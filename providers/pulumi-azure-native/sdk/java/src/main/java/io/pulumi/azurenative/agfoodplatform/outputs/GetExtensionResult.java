// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform.outputs;

import io.pulumi.azurenative.agfoodplatform.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExtensionResult {
    /**
     * The ETag value to implement optimistic concurrency.
     * 
     */
    private final String eTag;
    /**
     * Extension api docs link.
     * 
     */
    private final String extensionApiDocsLink;
    /**
     * Extension auth link.
     * 
     */
    private final String extensionAuthLink;
    /**
     * Extension category. e.g. weather/sensor/satellite.
     * 
     */
    private final String extensionCategory;
    /**
     * Extension Id.
     * 
     */
    private final String extensionId;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Installed extension version.
     * 
     */
    private final String installedExtensionVersion;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetExtensionResult(
        @CustomType.Parameter("eTag") String eTag,
        @CustomType.Parameter("extensionApiDocsLink") String extensionApiDocsLink,
        @CustomType.Parameter("extensionAuthLink") String extensionAuthLink,
        @CustomType.Parameter("extensionCategory") String extensionCategory,
        @CustomType.Parameter("extensionId") String extensionId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("installedExtensionVersion") String installedExtensionVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.eTag = eTag;
        this.extensionApiDocsLink = extensionApiDocsLink;
        this.extensionAuthLink = extensionAuthLink;
        this.extensionCategory = extensionCategory;
        this.extensionId = extensionId;
        this.id = id;
        this.installedExtensionVersion = installedExtensionVersion;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The ETag value to implement optimistic concurrency.
     * 
    */
    public String getETag() {
        return this.eTag;
    }
    /**
     * Extension api docs link.
     * 
    */
    public String getExtensionApiDocsLink() {
        return this.extensionApiDocsLink;
    }
    /**
     * Extension auth link.
     * 
    */
    public String getExtensionAuthLink() {
        return this.extensionAuthLink;
    }
    /**
     * Extension category. e.g. weather/sensor/satellite.
     * 
    */
    public String getExtensionCategory() {
        return this.extensionCategory;
    }
    /**
     * Extension Id.
     * 
    */
    public String getExtensionId() {
        return this.extensionId;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Installed extension version.
     * 
    */
    public String getInstalledExtensionVersion() {
        return this.installedExtensionVersion;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eTag;
        private String extensionApiDocsLink;
        private String extensionAuthLink;
        private String extensionCategory;
        private String extensionId;
        private String id;
        private String installedExtensionVersion;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.extensionApiDocsLink = defaults.extensionApiDocsLink;
    	      this.extensionAuthLink = defaults.extensionAuthLink;
    	      this.extensionCategory = defaults.extensionCategory;
    	      this.extensionId = defaults.extensionId;
    	      this.id = defaults.id;
    	      this.installedExtensionVersion = defaults.installedExtensionVersion;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder eTag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }
        public Builder extensionApiDocsLink(String extensionApiDocsLink) {
            this.extensionApiDocsLink = Objects.requireNonNull(extensionApiDocsLink);
            return this;
        }
        public Builder extensionAuthLink(String extensionAuthLink) {
            this.extensionAuthLink = Objects.requireNonNull(extensionAuthLink);
            return this;
        }
        public Builder extensionCategory(String extensionCategory) {
            this.extensionCategory = Objects.requireNonNull(extensionCategory);
            return this;
        }
        public Builder extensionId(String extensionId) {
            this.extensionId = Objects.requireNonNull(extensionId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder installedExtensionVersion(String installedExtensionVersion) {
            this.installedExtensionVersion = Objects.requireNonNull(installedExtensionVersion);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetExtensionResult build() {
            return new GetExtensionResult(eTag, extensionApiDocsLink, extensionAuthLink, extensionCategory, extensionId, id, installedExtensionVersion, name, systemData, type);
        }
    }
}
