// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLogGroupsResult {
    /**
     * Set of ARNs of the Cloudwatch log groups
     * 
     */
    private final List<String> arns;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String logGroupNamePrefix;
    /**
     * Set of names of the Cloudwatch log groups
     * 
     */
    private final List<String> logGroupNames;

    @CustomType.Constructor
    private GetLogGroupsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("logGroupNamePrefix") String logGroupNamePrefix,
        @CustomType.Parameter("logGroupNames") List<String> logGroupNames) {
        this.arns = arns;
        this.id = id;
        this.logGroupNamePrefix = logGroupNamePrefix;
        this.logGroupNames = logGroupNames;
    }

    /**
     * Set of ARNs of the Cloudwatch log groups
     * 
    */
    public List<String> getArns() {
        return this.arns;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getLogGroupNamePrefix() {
        return this.logGroupNamePrefix;
    }
    /**
     * Set of names of the Cloudwatch log groups
     * 
    */
    public List<String> getLogGroupNames() {
        return this.logGroupNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String id;
        private String logGroupNamePrefix;
        private List<String> logGroupNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
    	      this.logGroupNamePrefix = defaults.logGroupNamePrefix;
    	      this.logGroupNames = defaults.logGroupNames;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder logGroupNamePrefix(String logGroupNamePrefix) {
            this.logGroupNamePrefix = Objects.requireNonNull(logGroupNamePrefix);
            return this;
        }
        public Builder logGroupNames(List<String> logGroupNames) {
            this.logGroupNames = Objects.requireNonNull(logGroupNames);
            return this;
        }
        public Builder logGroupNames(String... logGroupNames) {
            return logGroupNames(List.of(logGroupNames));
        }        public GetLogGroupsResult build() {
            return new GetLogGroupsResult(arns, id, logGroupNamePrefix, logGroupNames);
        }
    }
}
