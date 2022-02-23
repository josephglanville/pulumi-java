// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerCertificateArgs Empty = new GetServerCertificateArgs();

    @InputImport(name="serverCertificateName", required=true)
      private final String serverCertificateName;

    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    public GetServerCertificateArgs(String serverCertificateName) {
        this.serverCertificateName = Objects.requireNonNull(serverCertificateName, "expected parameter 'serverCertificateName' to be non-null");
    }

    private GetServerCertificateArgs() {
        this.serverCertificateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serverCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverCertificateName = defaults.serverCertificateName;
        }

        public Builder setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = Objects.requireNonNull(serverCertificateName);
            return this;
        }
        public GetServerCertificateArgs build() {
            return new GetServerCertificateArgs(serverCertificateName);
        }
    }
}
