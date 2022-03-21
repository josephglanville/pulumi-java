// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ExpressRouteLinkMacSecCipher;
import io.pulumi.azurenative.network.enums.ExpressRouteLinkMacSecSciState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExpressRouteLink Mac Security Configuration.
 * 
 */
public final class ExpressRouteLinkMacSecConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteLinkMacSecConfigArgs Empty = new ExpressRouteLinkMacSecConfigArgs();

    /**
     * Keyvault Secret Identifier URL containing Mac security CAK key.
     * 
     */
    @Import(name="cakSecretIdentifier")
      private final @Nullable Output<String> cakSecretIdentifier;

    public Output<String> getCakSecretIdentifier() {
        return this.cakSecretIdentifier == null ? Output.empty() : this.cakSecretIdentifier;
    }

    /**
     * Mac security cipher.
     * 
     */
    @Import(name="cipher")
      private final @Nullable Output<Either<String,ExpressRouteLinkMacSecCipher>> cipher;

    public Output<Either<String,ExpressRouteLinkMacSecCipher>> getCipher() {
        return this.cipher == null ? Output.empty() : this.cipher;
    }

    /**
     * Keyvault Secret Identifier URL containing Mac security CKN key.
     * 
     */
    @Import(name="cknSecretIdentifier")
      private final @Nullable Output<String> cknSecretIdentifier;

    public Output<String> getCknSecretIdentifier() {
        return this.cknSecretIdentifier == null ? Output.empty() : this.cknSecretIdentifier;
    }

    /**
     * Sci mode enabled/disabled.
     * 
     */
    @Import(name="sciState")
      private final @Nullable Output<Either<String,ExpressRouteLinkMacSecSciState>> sciState;

    public Output<Either<String,ExpressRouteLinkMacSecSciState>> getSciState() {
        return this.sciState == null ? Output.empty() : this.sciState;
    }

    public ExpressRouteLinkMacSecConfigArgs(
        @Nullable Output<String> cakSecretIdentifier,
        @Nullable Output<Either<String,ExpressRouteLinkMacSecCipher>> cipher,
        @Nullable Output<String> cknSecretIdentifier,
        @Nullable Output<Either<String,ExpressRouteLinkMacSecSciState>> sciState) {
        this.cakSecretIdentifier = cakSecretIdentifier;
        this.cipher = cipher;
        this.cknSecretIdentifier = cknSecretIdentifier;
        this.sciState = sciState;
    }

    private ExpressRouteLinkMacSecConfigArgs() {
        this.cakSecretIdentifier = Output.empty();
        this.cipher = Output.empty();
        this.cknSecretIdentifier = Output.empty();
        this.sciState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteLinkMacSecConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cakSecretIdentifier;
        private @Nullable Output<Either<String,ExpressRouteLinkMacSecCipher>> cipher;
        private @Nullable Output<String> cknSecretIdentifier;
        private @Nullable Output<Either<String,ExpressRouteLinkMacSecSciState>> sciState;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteLinkMacSecConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cakSecretIdentifier = defaults.cakSecretIdentifier;
    	      this.cipher = defaults.cipher;
    	      this.cknSecretIdentifier = defaults.cknSecretIdentifier;
    	      this.sciState = defaults.sciState;
        }

        public Builder cakSecretIdentifier(@Nullable Output<String> cakSecretIdentifier) {
            this.cakSecretIdentifier = cakSecretIdentifier;
            return this;
        }
        public Builder cakSecretIdentifier(@Nullable String cakSecretIdentifier) {
            this.cakSecretIdentifier = Output.ofNullable(cakSecretIdentifier);
            return this;
        }
        public Builder cipher(@Nullable Output<Either<String,ExpressRouteLinkMacSecCipher>> cipher) {
            this.cipher = cipher;
            return this;
        }
        public Builder cipher(@Nullable Either<String,ExpressRouteLinkMacSecCipher> cipher) {
            this.cipher = Output.ofNullable(cipher);
            return this;
        }
        public Builder cknSecretIdentifier(@Nullable Output<String> cknSecretIdentifier) {
            this.cknSecretIdentifier = cknSecretIdentifier;
            return this;
        }
        public Builder cknSecretIdentifier(@Nullable String cknSecretIdentifier) {
            this.cknSecretIdentifier = Output.ofNullable(cknSecretIdentifier);
            return this;
        }
        public Builder sciState(@Nullable Output<Either<String,ExpressRouteLinkMacSecSciState>> sciState) {
            this.sciState = sciState;
            return this;
        }
        public Builder sciState(@Nullable Either<String,ExpressRouteLinkMacSecSciState> sciState) {
            this.sciState = Output.ofNullable(sciState);
            return this;
        }        public ExpressRouteLinkMacSecConfigArgs build() {
            return new ExpressRouteLinkMacSecConfigArgs(cakSecretIdentifier, cipher, cknSecretIdentifier, sciState);
        }
    }
}
