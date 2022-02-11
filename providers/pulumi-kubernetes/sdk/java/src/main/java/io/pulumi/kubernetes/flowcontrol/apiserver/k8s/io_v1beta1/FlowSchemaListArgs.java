// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.FlowSchemaArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ListMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowSchemaListArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSchemaListArgs Empty = new FlowSchemaListArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="items", required=true)
    private final Input<List<FlowSchemaArgs>> items;

    public Input<List<FlowSchemaArgs>> getItems() {
        return this.items;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<ListMetaArgs> metadata;

    public Input<ListMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    public FlowSchemaListArgs(
        @Nullable Input<String> apiVersion,
        Input<List<FlowSchemaArgs>> items,
        @Nullable Input<String> kind,
        @Nullable Input<ListMetaArgs> metadata) {
        this.apiVersion = apiVersion;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
    }

    private FlowSchemaListArgs() {
        this.apiVersion = Input.empty();
        this.items = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private Input<List<FlowSchemaArgs>> items;
        private @Nullable Input<String> kind;
        private @Nullable Input<ListMetaArgs> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setItems(Input<List<FlowSchemaArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setItems(List<FlowSchemaArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ListMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ListMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public FlowSchemaListArgs build() {
            return new FlowSchemaListArgs(apiVersion, items, kind, metadata);
        }
    }
}
