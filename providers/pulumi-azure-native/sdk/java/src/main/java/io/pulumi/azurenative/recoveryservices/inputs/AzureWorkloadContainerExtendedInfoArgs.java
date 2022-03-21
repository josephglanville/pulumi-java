// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DistributedNodesInfoArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InquiryInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Extended information of the container.
 * 
 */
public final class AzureWorkloadContainerExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureWorkloadContainerExtendedInfoArgs Empty = new AzureWorkloadContainerExtendedInfoArgs();

    /**
     * Host Os Name in case of Stand Alone and Cluster Name in case of distributed container.
     * 
     */
    @Import(name="hostServerName")
      private final @Nullable Output<String> hostServerName;

    public Output<String> getHostServerName() {
        return this.hostServerName == null ? Output.empty() : this.hostServerName;
    }

    /**
     * Inquiry Status for the container.
     * 
     */
    @Import(name="inquiryInfo")
      private final @Nullable Output<InquiryInfoArgs> inquiryInfo;

    public Output<InquiryInfoArgs> getInquiryInfo() {
        return this.inquiryInfo == null ? Output.empty() : this.inquiryInfo;
    }

    /**
     * List of the nodes in case of distributed container.
     * 
     */
    @Import(name="nodesList")
      private final @Nullable Output<List<DistributedNodesInfoArgs>> nodesList;

    public Output<List<DistributedNodesInfoArgs>> getNodesList() {
        return this.nodesList == null ? Output.empty() : this.nodesList;
    }

    public AzureWorkloadContainerExtendedInfoArgs(
        @Nullable Output<String> hostServerName,
        @Nullable Output<InquiryInfoArgs> inquiryInfo,
        @Nullable Output<List<DistributedNodesInfoArgs>> nodesList) {
        this.hostServerName = hostServerName;
        this.inquiryInfo = inquiryInfo;
        this.nodesList = nodesList;
    }

    private AzureWorkloadContainerExtendedInfoArgs() {
        this.hostServerName = Output.empty();
        this.inquiryInfo = Output.empty();
        this.nodesList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadContainerExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostServerName;
        private @Nullable Output<InquiryInfoArgs> inquiryInfo;
        private @Nullable Output<List<DistributedNodesInfoArgs>> nodesList;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadContainerExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostServerName = defaults.hostServerName;
    	      this.inquiryInfo = defaults.inquiryInfo;
    	      this.nodesList = defaults.nodesList;
        }

        public Builder hostServerName(@Nullable Output<String> hostServerName) {
            this.hostServerName = hostServerName;
            return this;
        }
        public Builder hostServerName(@Nullable String hostServerName) {
            this.hostServerName = Output.ofNullable(hostServerName);
            return this;
        }
        public Builder inquiryInfo(@Nullable Output<InquiryInfoArgs> inquiryInfo) {
            this.inquiryInfo = inquiryInfo;
            return this;
        }
        public Builder inquiryInfo(@Nullable InquiryInfoArgs inquiryInfo) {
            this.inquiryInfo = Output.ofNullable(inquiryInfo);
            return this;
        }
        public Builder nodesList(@Nullable Output<List<DistributedNodesInfoArgs>> nodesList) {
            this.nodesList = nodesList;
            return this;
        }
        public Builder nodesList(@Nullable List<DistributedNodesInfoArgs> nodesList) {
            this.nodesList = Output.ofNullable(nodesList);
            return this;
        }
        public Builder nodesList(DistributedNodesInfoArgs... nodesList) {
            return nodesList(List.of(nodesList));
        }        public AzureWorkloadContainerExtendedInfoArgs build() {
            return new AzureWorkloadContainerExtendedInfoArgs(hostServerName, inquiryInfo, nodesList);
        }
    }
}
