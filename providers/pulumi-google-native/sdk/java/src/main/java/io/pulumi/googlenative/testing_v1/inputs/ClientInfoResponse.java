// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.testing_v1.inputs.ClientInfoDetailResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information about the client which invoked the test.
 * 
 */
public final class ClientInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientInfoResponse Empty = new ClientInfoResponse();

    /**
     * The list of detailed information about client.
     * 
     */
    @Import(name="clientInfoDetails", required=true)
      private final List<ClientInfoDetailResponse> clientInfoDetails;

    public List<ClientInfoDetailResponse> getClientInfoDetails() {
        return this.clientInfoDetails;
    }

    /**
     * Client name, such as gcloud.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ClientInfoResponse(
        List<ClientInfoDetailResponse> clientInfoDetails,
        String name) {
        this.clientInfoDetails = Objects.requireNonNull(clientInfoDetails, "expected parameter 'clientInfoDetails' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ClientInfoResponse() {
        this.clientInfoDetails = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ClientInfoDetailResponse> clientInfoDetails;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientInfoDetails = defaults.clientInfoDetails;
    	      this.name = defaults.name;
        }

        public Builder clientInfoDetails(List<ClientInfoDetailResponse> clientInfoDetails) {
            this.clientInfoDetails = Objects.requireNonNull(clientInfoDetails);
            return this;
        }
        public Builder clientInfoDetails(ClientInfoDetailResponse... clientInfoDetails) {
            return clientInfoDetails(List.of(clientInfoDetails));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ClientInfoResponse build() {
            return new ClientInfoResponse(clientInfoDetails, name);
        }
    }
}
