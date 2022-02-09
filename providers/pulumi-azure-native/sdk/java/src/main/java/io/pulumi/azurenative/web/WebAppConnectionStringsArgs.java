// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ConnStringValueTypePairArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppConnectionStringsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppConnectionStringsArgs Empty = new WebAppConnectionStringsArgs();

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="properties")
    private final @Nullable Input<Map<String,ConnStringValueTypePairArgs>> properties;

    public Input<Map<String,ConnStringValueTypePairArgs>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public WebAppConnectionStringsArgs(
        @Nullable Input<String> kind,
        Input<String> name,
        @Nullable Input<Map<String,ConnStringValueTypePairArgs>> properties,
        Input<String> resourceGroupName) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private WebAppConnectionStringsArgs() {
        this.kind = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppConnectionStringsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private Input<String> name;
        private @Nullable Input<Map<String,ConnStringValueTypePairArgs>> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppConnectionStringsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,ConnStringValueTypePairArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,ConnStringValueTypePairArgs> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public WebAppConnectionStringsArgs build() {
            return new WebAppConnectionStringsArgs(kind, name, properties, resourceGroupName);
        }
    }
}
