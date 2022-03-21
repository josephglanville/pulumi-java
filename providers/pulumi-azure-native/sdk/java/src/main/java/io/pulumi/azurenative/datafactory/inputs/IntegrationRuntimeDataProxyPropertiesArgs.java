// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.EntityReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data proxy properties for a managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeDataProxyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeDataProxyPropertiesArgs Empty = new IntegrationRuntimeDataProxyPropertiesArgs();

    /**
     * The self-hosted integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<EntityReferenceArgs> connectVia;

    public Output<EntityReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * The path to contain the staged data in the Blob storage.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * The staging linked service reference.
     * 
     */
    @Import(name="stagingLinkedService")
      private final @Nullable Output<EntityReferenceArgs> stagingLinkedService;

    public Output<EntityReferenceArgs> getStagingLinkedService() {
        return this.stagingLinkedService == null ? Output.empty() : this.stagingLinkedService;
    }

    public IntegrationRuntimeDataProxyPropertiesArgs(
        @Nullable Output<EntityReferenceArgs> connectVia,
        @Nullable Output<String> path,
        @Nullable Output<EntityReferenceArgs> stagingLinkedService) {
        this.connectVia = connectVia;
        this.path = path;
        this.stagingLinkedService = stagingLinkedService;
    }

    private IntegrationRuntimeDataProxyPropertiesArgs() {
        this.connectVia = Output.empty();
        this.path = Output.empty();
        this.stagingLinkedService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataProxyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EntityReferenceArgs> connectVia;
        private @Nullable Output<String> path;
        private @Nullable Output<EntityReferenceArgs> stagingLinkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataProxyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.path = defaults.path;
    	      this.stagingLinkedService = defaults.stagingLinkedService;
        }

        public Builder connectVia(@Nullable Output<EntityReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable EntityReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public Builder stagingLinkedService(@Nullable Output<EntityReferenceArgs> stagingLinkedService) {
            this.stagingLinkedService = stagingLinkedService;
            return this;
        }
        public Builder stagingLinkedService(@Nullable EntityReferenceArgs stagingLinkedService) {
            this.stagingLinkedService = Output.ofNullable(stagingLinkedService);
            return this;
        }        public IntegrationRuntimeDataProxyPropertiesArgs build() {
            return new IntegrationRuntimeDataProxyPropertiesArgs(connectVia, path, stagingLinkedService);
        }
    }
}
