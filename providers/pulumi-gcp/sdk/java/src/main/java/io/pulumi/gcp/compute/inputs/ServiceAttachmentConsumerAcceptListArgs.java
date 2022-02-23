// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceAttachmentConsumerAcceptListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentConsumerAcceptListArgs Empty = new ServiceAttachmentConsumerAcceptListArgs();

    /**
     * The number of consumer forwarding rules the consumer project can
     * create.
     * 
     */
    @InputImport(name="connectionLimit", required=true)
      private final Input<Integer> connectionLimit;

    public Input<Integer> getConnectionLimit() {
        return this.connectionLimit;
    }

    /**
     * A project that is allowed to connect to this service attachment.
     * 
     */
    @InputImport(name="projectIdOrNum", required=true)
      private final Input<String> projectIdOrNum;

    public Input<String> getProjectIdOrNum() {
        return this.projectIdOrNum;
    }

    public ServiceAttachmentConsumerAcceptListArgs(
        Input<Integer> connectionLimit,
        Input<String> projectIdOrNum) {
        this.connectionLimit = Objects.requireNonNull(connectionLimit, "expected parameter 'connectionLimit' to be non-null");
        this.projectIdOrNum = Objects.requireNonNull(projectIdOrNum, "expected parameter 'projectIdOrNum' to be non-null");
    }

    private ServiceAttachmentConsumerAcceptListArgs() {
        this.connectionLimit = Input.empty();
        this.projectIdOrNum = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConsumerAcceptListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> connectionLimit;
        private Input<String> projectIdOrNum;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConsumerAcceptListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionLimit = defaults.connectionLimit;
    	      this.projectIdOrNum = defaults.projectIdOrNum;
        }

        public Builder setConnectionLimit(Input<Integer> connectionLimit) {
            this.connectionLimit = Objects.requireNonNull(connectionLimit);
            return this;
        }

        public Builder setConnectionLimit(Integer connectionLimit) {
            this.connectionLimit = Input.of(Objects.requireNonNull(connectionLimit));
            return this;
        }

        public Builder setProjectIdOrNum(Input<String> projectIdOrNum) {
            this.projectIdOrNum = Objects.requireNonNull(projectIdOrNum);
            return this;
        }

        public Builder setProjectIdOrNum(String projectIdOrNum) {
            this.projectIdOrNum = Input.of(Objects.requireNonNull(projectIdOrNum));
            return this;
        }
        public ServiceAttachmentConsumerAcceptListArgs build() {
            return new ServiceAttachmentConsumerAcceptListArgs(connectionLimit, projectIdOrNum);
        }
    }
}
