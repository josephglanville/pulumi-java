// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.MessageFilterType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 message filter for odata query.
 * 
 */
public final class X12MessageFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12MessageFilterArgs Empty = new X12MessageFilterArgs();

    /**
     * The message filter type.
     * 
     */
    @InputImport(name="messageFilterType", required=true)
      private final Input<Either<String,MessageFilterType>> messageFilterType;

    public Input<Either<String,MessageFilterType>> getMessageFilterType() {
        return this.messageFilterType;
    }

    public X12MessageFilterArgs(Input<Either<String,MessageFilterType>> messageFilterType) {
        this.messageFilterType = Objects.requireNonNull(messageFilterType, "expected parameter 'messageFilterType' to be non-null");
    }

    private X12MessageFilterArgs() {
        this.messageFilterType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12MessageFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,MessageFilterType>> messageFilterType;

        public Builder() {
    	      // Empty
        }

        public Builder(X12MessageFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFilterType = defaults.messageFilterType;
        }

        public Builder setMessageFilterType(Input<Either<String,MessageFilterType>> messageFilterType) {
            this.messageFilterType = Objects.requireNonNull(messageFilterType);
            return this;
        }

        public Builder setMessageFilterType(Either<String,MessageFilterType> messageFilterType) {
            this.messageFilterType = Input.of(Objects.requireNonNull(messageFilterType));
            return this;
        }
        public X12MessageFilterArgs build() {
            return new X12MessageFilterArgs(messageFilterType);
        }
    }
}
