// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ContentKeyPolicyOpenRestrictionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyOpenRestrictionArgs Empty = new ContentKeyPolicyOpenRestrictionArgs();

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyOpenRestrictionArgs(Input<String> odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyOpenRestrictionArgs() {
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyOpenRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyOpenRestrictionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public ContentKeyPolicyOpenRestrictionArgs build() {
            return new ContentKeyPolicyOpenRestrictionArgs(odataType);
        }
    }
}
