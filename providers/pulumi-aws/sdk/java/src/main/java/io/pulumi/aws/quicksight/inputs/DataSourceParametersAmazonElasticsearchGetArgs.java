// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersAmazonElasticsearchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAmazonElasticsearchGetArgs Empty = new DataSourceParametersAmazonElasticsearchGetArgs();

    /**
     * The OpenSearch domain.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> getDomain() {
        return this.domain;
    }

    public DataSourceParametersAmazonElasticsearchGetArgs(Output<String> domain) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private DataSourceParametersAmazonElasticsearchGetArgs() {
        this.domain = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAmazonElasticsearchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAmazonElasticsearchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }        public DataSourceParametersAmazonElasticsearchGetArgs build() {
            return new DataSourceParametersAmazonElasticsearchGetArgs(domain);
        }
    }
}
