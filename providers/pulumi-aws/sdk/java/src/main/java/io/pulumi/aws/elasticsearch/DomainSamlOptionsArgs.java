// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch;

import io.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainSamlOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSamlOptionsArgs Empty = new DomainSamlOptionsArgs();

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    @Import(name="samlOptions")
      private final @Nullable Output<DomainSamlOptionsSamlOptionsArgs> samlOptions;

    public Output<DomainSamlOptionsSamlOptionsArgs> getSamlOptions() {
        return this.samlOptions == null ? Codegen.empty() : this.samlOptions;
    }

    public DomainSamlOptionsArgs(
        Output<String> domainName,
        @Nullable Output<DomainSamlOptionsSamlOptionsArgs> samlOptions) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.samlOptions = samlOptions;
    }

    private DomainSamlOptionsArgs() {
        this.domainName = Codegen.empty();
        this.samlOptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSamlOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private @Nullable Output<DomainSamlOptionsSamlOptionsArgs> samlOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSamlOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.samlOptions = defaults.samlOptions;
        }

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder samlOptions(@Nullable Output<DomainSamlOptionsSamlOptionsArgs> samlOptions) {
            this.samlOptions = samlOptions;
            return this;
        }
        public Builder samlOptions(@Nullable DomainSamlOptionsSamlOptionsArgs samlOptions) {
            this.samlOptions = Codegen.ofNullable(samlOptions);
            return this;
        }        public DomainSamlOptionsArgs build() {
            return new DomainSamlOptionsArgs(domainName, samlOptions);
        }
    }
}
