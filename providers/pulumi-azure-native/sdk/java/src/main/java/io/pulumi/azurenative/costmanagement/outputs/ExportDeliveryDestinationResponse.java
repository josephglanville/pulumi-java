// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExportDeliveryDestinationResponse {
    private final String container;
    private final String resourceId;
    private final @Nullable String rootFolderPath;

    @OutputCustomType.Constructor({"container","resourceId","rootFolderPath"})
    private ExportDeliveryDestinationResponse(
        String container,
        String resourceId,
        @Nullable String rootFolderPath) {
        this.container = Objects.requireNonNull(container);
        this.resourceId = Objects.requireNonNull(resourceId);
        this.rootFolderPath = rootFolderPath;
    }

    public String getContainer() {
        return this.container;
    }
    public String getResourceId() {
        return this.resourceId;
    }
    public Optional<String> getRootFolderPath() {
        return Optional.ofNullable(this.rootFolderPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDeliveryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String resourceId;
        private @Nullable String rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDeliveryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder setContainer(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }

        public ExportDeliveryDestinationResponse build() {
            return new ExportDeliveryDestinationResponse(container, resourceId, rootFolderPath);
        }
    }
}
