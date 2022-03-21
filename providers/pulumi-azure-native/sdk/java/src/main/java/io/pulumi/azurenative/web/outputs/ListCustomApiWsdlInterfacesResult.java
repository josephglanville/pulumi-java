// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.WsdlServiceResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListCustomApiWsdlInterfacesResult {
    /**
     * Collection of WSDL interfaces
     * 
     */
    private final @Nullable List<WsdlServiceResponse> value;

    @CustomType.Constructor
    private ListCustomApiWsdlInterfacesResult(@CustomType.Parameter("value") @Nullable List<WsdlServiceResponse> value) {
        this.value = value;
    }

    /**
     * Collection of WSDL interfaces
     * 
    */
    public List<WsdlServiceResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListCustomApiWsdlInterfacesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WsdlServiceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListCustomApiWsdlInterfacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<WsdlServiceResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(WsdlServiceResponse... value) {
            return value(List.of(value));
        }        public ListCustomApiWsdlInterfacesResult build() {
            return new ListCustomApiWsdlInterfacesResult(value);
        }
    }
}
