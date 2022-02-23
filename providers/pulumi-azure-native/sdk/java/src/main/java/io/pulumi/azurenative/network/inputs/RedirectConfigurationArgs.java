// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FrontDoorRedirectProtocol;
import io.pulumi.azurenative.network.enums.FrontDoorRedirectType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes Redirect Route.
 * 
 */
public final class RedirectConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedirectConfigurationArgs Empty = new RedirectConfigurationArgs();

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    @InputImport(name="customFragment")
      private final @Nullable Input<String> customFragment;

    public Input<String> getCustomFragment() {
        return this.customFragment == null ? Input.empty() : this.customFragment;
    }

    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    @InputImport(name="customHost")
      private final @Nullable Input<String> customHost;

    public Input<String> getCustomHost() {
        return this.customHost == null ? Input.empty() : this.customHost;
    }

    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    @InputImport(name="customPath")
      private final @Nullable Input<String> customPath;

    public Input<String> getCustomPath() {
        return this.customPath == null ? Input.empty() : this.customPath;
    }

    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. The first ? and & will be added automatically so do not include them in the front, but do separate multiple query strings with &.
     * 
     */
    @InputImport(name="customQueryString")
      private final @Nullable Input<String> customQueryString;

    public Input<String> getCustomQueryString() {
        return this.customQueryString == null ? Input.empty() : this.customQueryString;
    }

    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The protocol of the destination to where the traffic is redirected
     * 
     */
    @InputImport(name="redirectProtocol")
      private final @Nullable Input<Either<String,FrontDoorRedirectProtocol>> redirectProtocol;

    public Input<Either<String,FrontDoorRedirectProtocol>> getRedirectProtocol() {
        return this.redirectProtocol == null ? Input.empty() : this.redirectProtocol;
    }

    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    @InputImport(name="redirectType")
      private final @Nullable Input<Either<String,FrontDoorRedirectType>> redirectType;

    public Input<Either<String,FrontDoorRedirectType>> getRedirectType() {
        return this.redirectType == null ? Input.empty() : this.redirectType;
    }

    public RedirectConfigurationArgs(
        @Nullable Input<String> customFragment,
        @Nullable Input<String> customHost,
        @Nullable Input<String> customPath,
        @Nullable Input<String> customQueryString,
        Input<String> odataType,
        @Nullable Input<Either<String,FrontDoorRedirectProtocol>> redirectProtocol,
        @Nullable Input<Either<String,FrontDoorRedirectType>> redirectType) {
        this.customFragment = customFragment;
        this.customHost = customHost;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.redirectProtocol = redirectProtocol;
        this.redirectType = redirectType;
    }

    private RedirectConfigurationArgs() {
        this.customFragment = Input.empty();
        this.customHost = Input.empty();
        this.customPath = Input.empty();
        this.customQueryString = Input.empty();
        this.odataType = Input.empty();
        this.redirectProtocol = Input.empty();
        this.redirectType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customFragment;
        private @Nullable Input<String> customHost;
        private @Nullable Input<String> customPath;
        private @Nullable Input<String> customQueryString;
        private Input<String> odataType;
        private @Nullable Input<Either<String,FrontDoorRedirectProtocol>> redirectProtocol;
        private @Nullable Input<Either<String,FrontDoorRedirectType>> redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHost = defaults.customHost;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.odataType = defaults.odataType;
    	      this.redirectProtocol = defaults.redirectProtocol;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder setCustomFragment(@Nullable Input<String> customFragment) {
            this.customFragment = customFragment;
            return this;
        }

        public Builder setCustomFragment(@Nullable String customFragment) {
            this.customFragment = Input.ofNullable(customFragment);
            return this;
        }

        public Builder setCustomHost(@Nullable Input<String> customHost) {
            this.customHost = customHost;
            return this;
        }

        public Builder setCustomHost(@Nullable String customHost) {
            this.customHost = Input.ofNullable(customHost);
            return this;
        }

        public Builder setCustomPath(@Nullable Input<String> customPath) {
            this.customPath = customPath;
            return this;
        }

        public Builder setCustomPath(@Nullable String customPath) {
            this.customPath = Input.ofNullable(customPath);
            return this;
        }

        public Builder setCustomQueryString(@Nullable Input<String> customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }

        public Builder setCustomQueryString(@Nullable String customQueryString) {
            this.customQueryString = Input.ofNullable(customQueryString);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setRedirectProtocol(@Nullable Input<Either<String,FrontDoorRedirectProtocol>> redirectProtocol) {
            this.redirectProtocol = redirectProtocol;
            return this;
        }

        public Builder setRedirectProtocol(@Nullable Either<String,FrontDoorRedirectProtocol> redirectProtocol) {
            this.redirectProtocol = Input.ofNullable(redirectProtocol);
            return this;
        }

        public Builder setRedirectType(@Nullable Input<Either<String,FrontDoorRedirectType>> redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        public Builder setRedirectType(@Nullable Either<String,FrontDoorRedirectType> redirectType) {
            this.redirectType = Input.ofNullable(redirectType);
            return this;
        }
        public RedirectConfigurationArgs build() {
            return new RedirectConfigurationArgs(customFragment, customHost, customPath, customQueryString, odataType, redirectProtocol, redirectType);
        }
    }
}
