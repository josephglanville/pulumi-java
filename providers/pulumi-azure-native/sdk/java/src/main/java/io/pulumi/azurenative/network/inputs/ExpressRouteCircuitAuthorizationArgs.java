// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.AuthorizationUseStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitAuthorizationArgs Empty = new ExpressRouteCircuitAuthorizationArgs();

    @InputImport(name="authorizationKey")
    private final @Nullable Input<String> authorizationKey;

    public Input<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Input.empty() : this.authorizationKey;
    }

    @InputImport(name="authorizationUseStatus")
    private final @Nullable Input<Either<String,AuthorizationUseStatus>> authorizationUseStatus;

    public Input<Either<String,AuthorizationUseStatus>> getAuthorizationUseStatus() {
        return this.authorizationUseStatus == null ? Input.empty() : this.authorizationUseStatus;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ExpressRouteCircuitAuthorizationArgs(
        @Nullable Input<String> authorizationKey,
        @Nullable Input<Either<String,AuthorizationUseStatus>> authorizationUseStatus,
        @Nullable Input<String> id,
        @Nullable Input<String> name) {
        this.authorizationKey = authorizationKey;
        this.authorizationUseStatus = authorizationUseStatus;
        this.id = id;
        this.name = name;
    }

    private ExpressRouteCircuitAuthorizationArgs() {
        this.authorizationKey = Input.empty();
        this.authorizationUseStatus = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationKey;
        private @Nullable Input<Either<String,AuthorizationUseStatus>> authorizationUseStatus;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.authorizationUseStatus = defaults.authorizationUseStatus;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setAuthorizationKey(@Nullable Input<String> authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = Input.ofNullable(authorizationKey);
            return this;
        }

        public Builder setAuthorizationUseStatus(@Nullable Input<Either<String,AuthorizationUseStatus>> authorizationUseStatus) {
            this.authorizationUseStatus = authorizationUseStatus;
            return this;
        }

        public Builder setAuthorizationUseStatus(@Nullable Either<String,AuthorizationUseStatus> authorizationUseStatus) {
            this.authorizationUseStatus = Input.ofNullable(authorizationUseStatus);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ExpressRouteCircuitAuthorizationArgs build() {
            return new ExpressRouteCircuitAuthorizationArgs(authorizationKey, authorizationUseStatus, id, name);
        }
    }
}
