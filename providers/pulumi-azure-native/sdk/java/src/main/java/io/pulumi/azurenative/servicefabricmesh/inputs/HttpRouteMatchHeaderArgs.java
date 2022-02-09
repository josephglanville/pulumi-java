// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.enums.HeaderMatchType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpRouteMatchHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteMatchHeaderArgs Empty = new HttpRouteMatchHeaderArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,HeaderMatchType>> type;

    public Input<Either<String,HeaderMatchType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public HttpRouteMatchHeaderArgs(
        Input<String> name,
        @Nullable Input<Either<String,HeaderMatchType>> type,
        @Nullable Input<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = type;
        this.value = value;
    }

    private HttpRouteMatchHeaderArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<Either<String,HeaderMatchType>> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,HeaderMatchType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,HeaderMatchType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public HttpRouteMatchHeaderArgs build() {
            return new HttpRouteMatchHeaderArgs(name, type, value);
        }
    }
}
