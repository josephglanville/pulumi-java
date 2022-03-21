// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The destination information for the delivery of the export. To allow access to a storage account, you must register the account's subscription with the Microsoft.CostManagementExports resource provider. This is required once per subscription. When creating an export in the Azure portal, it is done automatically, however API users need to register the subscription. For more information see https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-manager-supported-services .
 * 
 */
public final class ExportDeliveryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportDeliveryDestinationArgs Empty = new ExportDeliveryDestinationArgs();

    /**
     * The name of the container where exports will be uploaded.
     * 
     */
    @Import(name="container", required=true)
      private final Output<String> container;

    public Output<String> getContainer() {
        return this.container;
    }

    /**
     * The resource id of the storage account where exports will be delivered.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The name of the directory where exports will be uploaded.
     * 
     */
    @Import(name="rootFolderPath")
      private final @Nullable Output<String> rootFolderPath;

    public Output<String> getRootFolderPath() {
        return this.rootFolderPath == null ? Output.empty() : this.rootFolderPath;
    }

    public ExportDeliveryDestinationArgs(
        Output<String> container,
        Output<String> resourceId,
        @Nullable Output<String> rootFolderPath) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.rootFolderPath = rootFolderPath;
    }

    private ExportDeliveryDestinationArgs() {
        this.container = Output.empty();
        this.resourceId = Output.empty();
        this.rootFolderPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDeliveryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> container;
        private Output<String> resourceId;
        private @Nullable Output<String> rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDeliveryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder container(Output<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder container(String container) {
            this.container = Output.of(Objects.requireNonNull(container));
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder rootFolderPath(@Nullable Output<String> rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }
        public Builder rootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = Output.ofNullable(rootFolderPath);
            return this;
        }        public ExportDeliveryDestinationArgs build() {
            return new ExportDeliveryDestinationArgs(container, resourceId, rootFolderPath);
        }
    }
}
