// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetStateMachineResult {
    /**
     * Set to the arn of the state function.
     * 
     */
    private final String arn;
    /**
     * The date the state machine was created.
     * 
     */
    private final String creationDate;
    /**
     * Set to the state machine definition.
     * 
     */
    private final String definition;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * Set to the role_arn used by the state function.
     * 
     */
    private final String roleArn;
    /**
     * Set to the current status of the state machine.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private GetStateMachineResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("creationDate") String creationDate,
        @OutputCustomType.Parameter("definition") String definition,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("roleArn") String roleArn,
        @OutputCustomType.Parameter("status") String status) {
        this.arn = arn;
        this.creationDate = creationDate;
        this.definition = definition;
        this.id = id;
        this.name = name;
        this.roleArn = roleArn;
        this.status = status;
    }

    /**
     * Set to the arn of the state function.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The date the state machine was created.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Set to the state machine definition.
     * 
    */
    public String getDefinition() {
        return this.definition;
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
     * Set to the role_arn used by the state function.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * Set to the current status of the state machine.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStateMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String creationDate;
        private String definition;
        private String id;
        private String name;
        private String roleArn;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStateMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.definition = defaults.definition;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.status = defaults.status;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setDefinition(String definition) {
            this.definition = Objects.requireNonNull(definition);
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

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetStateMachineResult build() {
            return new GetStateMachineResult(arn, creationDate, definition, id, name, roleArn, status);
        }
    }
}
