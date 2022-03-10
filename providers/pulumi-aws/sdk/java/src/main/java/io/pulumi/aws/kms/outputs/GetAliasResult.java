// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAliasResult {
    /**
     * The Amazon Resource Name(ARN) of the key alias.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * ARN pointed to by the alias.
     * 
     */
    private final String targetKeyArn;
    /**
     * Key identifier pointed to by the alias.
     * 
     */
    private final String targetKeyId;

    @OutputCustomType.Constructor
    private GetAliasResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("targetKeyArn") String targetKeyArn,
        @OutputCustomType.Parameter("targetKeyId") String targetKeyId) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.targetKeyArn = targetKeyArn;
        this.targetKeyId = targetKeyId;
    }

    /**
     * The Amazon Resource Name(ARN) of the key alias.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * ARN pointed to by the alias.
     * 
    */
    public String getTargetKeyArn() {
        return this.targetKeyArn;
    }
    /**
     * Key identifier pointed to by the alias.
     * 
    */
    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private String targetKeyArn;
        private String targetKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.targetKeyArn = defaults.targetKeyArn;
    	      this.targetKeyId = defaults.targetKeyId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTargetKeyArn(String targetKeyArn) {
            this.targetKeyArn = Objects.requireNonNull(targetKeyArn);
            return this;
        }

        public Builder setTargetKeyId(String targetKeyId) {
            this.targetKeyId = Objects.requireNonNull(targetKeyId);
            return this;
        }
        public GetAliasResult build() {
            return new GetAliasResult(arn, id, name, targetKeyArn, targetKeyId);
        }
    }
}
