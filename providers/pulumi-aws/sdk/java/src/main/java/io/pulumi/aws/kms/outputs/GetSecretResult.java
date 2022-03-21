// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.aws.kms.outputs.GetSecretSecret;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecretResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetSecretSecret> secrets;

    @CustomType.Constructor
    private GetSecretResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("secrets") List<GetSecretSecret> secrets) {
        this.id = id;
        this.secrets = secrets;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<GetSecretSecret> getSecrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetSecretSecret> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.secrets = defaults.secrets;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder secrets(List<GetSecretSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(GetSecretSecret... secrets) {
            return secrets(List.of(secrets));
        }        public GetSecretResult build() {
            return new GetSecretResult(id, secrets);
        }
    }
}
