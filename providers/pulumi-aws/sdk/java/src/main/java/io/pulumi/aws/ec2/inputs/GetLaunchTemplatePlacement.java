// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchTemplatePlacement extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplatePlacement Empty = new GetLaunchTemplatePlacement();

    @Import(name="affinity", required=true)
      private final String affinity;

    public String getAffinity() {
        return this.affinity;
    }

    @Import(name="availabilityZone", required=true)
      private final String availabilityZone;

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    @Import(name="groupName", required=true)
      private final String groupName;

    public String getGroupName() {
        return this.groupName;
    }

    @Import(name="hostId", required=true)
      private final String hostId;

    public String getHostId() {
        return this.hostId;
    }

    @Import(name="hostResourceGroupArn", required=true)
      private final String hostResourceGroupArn;

    public String getHostResourceGroupArn() {
        return this.hostResourceGroupArn;
    }

    @Import(name="partitionNumber", required=true)
      private final Integer partitionNumber;

    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }

    @Import(name="spreadDomain", required=true)
      private final String spreadDomain;

    public String getSpreadDomain() {
        return this.spreadDomain;
    }

    @Import(name="tenancy", required=true)
      private final String tenancy;

    public String getTenancy() {
        return this.tenancy;
    }

    public GetLaunchTemplatePlacement(
        String affinity,
        String availabilityZone,
        String groupName,
        String hostId,
        String hostResourceGroupArn,
        Integer partitionNumber,
        String spreadDomain,
        String tenancy) {
        this.affinity = Objects.requireNonNull(affinity, "expected parameter 'affinity' to be non-null");
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.hostId = Objects.requireNonNull(hostId, "expected parameter 'hostId' to be non-null");
        this.hostResourceGroupArn = Objects.requireNonNull(hostResourceGroupArn, "expected parameter 'hostResourceGroupArn' to be non-null");
        this.partitionNumber = Objects.requireNonNull(partitionNumber, "expected parameter 'partitionNumber' to be non-null");
        this.spreadDomain = Objects.requireNonNull(spreadDomain, "expected parameter 'spreadDomain' to be non-null");
        this.tenancy = Objects.requireNonNull(tenancy, "expected parameter 'tenancy' to be non-null");
    }

    private GetLaunchTemplatePlacement() {
        this.affinity = null;
        this.availabilityZone = null;
        this.groupName = null;
        this.hostId = null;
        this.hostResourceGroupArn = null;
        this.partitionNumber = null;
        this.spreadDomain = null;
        this.tenancy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplatePlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affinity;
        private String availabilityZone;
        private String groupName;
        private String hostId;
        private String hostResourceGroupArn;
        private Integer partitionNumber;
        private String spreadDomain;
        private String tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplatePlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinity = defaults.affinity;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.hostId = defaults.hostId;
    	      this.hostResourceGroupArn = defaults.hostResourceGroupArn;
    	      this.partitionNumber = defaults.partitionNumber;
    	      this.spreadDomain = defaults.spreadDomain;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder affinity(String affinity) {
            this.affinity = Objects.requireNonNull(affinity);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder hostId(String hostId) {
            this.hostId = Objects.requireNonNull(hostId);
            return this;
        }
        public Builder hostResourceGroupArn(String hostResourceGroupArn) {
            this.hostResourceGroupArn = Objects.requireNonNull(hostResourceGroupArn);
            return this;
        }
        public Builder partitionNumber(Integer partitionNumber) {
            this.partitionNumber = Objects.requireNonNull(partitionNumber);
            return this;
        }
        public Builder spreadDomain(String spreadDomain) {
            this.spreadDomain = Objects.requireNonNull(spreadDomain);
            return this;
        }
        public Builder tenancy(String tenancy) {
            this.tenancy = Objects.requireNonNull(tenancy);
            return this;
        }        public GetLaunchTemplatePlacement build() {
            return new GetLaunchTemplatePlacement(affinity, availabilityZone, groupName, hostId, hostResourceGroupArn, partitionNumber, spreadDomain, tenancy);
        }
    }
}
