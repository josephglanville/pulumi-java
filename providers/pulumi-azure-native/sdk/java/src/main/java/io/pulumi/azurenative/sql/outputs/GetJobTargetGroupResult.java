// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.JobTargetResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJobTargetGroupResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Members of the target group.
     * 
     */
    private final List<JobTargetResponse> members;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetJobTargetGroupResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("members") List<JobTargetResponse> members,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.members = members;
        this.name = name;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Members of the target group.
     * 
    */
    public List<JobTargetResponse> getMembers() {
        return this.members;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTargetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<JobTargetResponse> members;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobTargetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder members(List<JobTargetResponse> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(JobTargetResponse... members) {
            return members(List.of(members));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetJobTargetGroupResult build() {
            return new GetJobTargetGroupResult(id, members, name, type);
        }
    }
}
