import React from "react";
import Button from "react-bootstrap/Button";
import Card from "react-bootstrap/Card";
import { DeleteForum } from "../../Service/forum";
import { useNavigate } from "react-router-dom";

function Forums(props) {
  console.log(props);
  const history = useNavigate();
  const handleClick = (forumId) => {
    history(`/forum/${forumId}`);
  };

  return (
    <>
      <div
        style={{
          display: "flex",
          flexWrap: "wrap",
          justifyContent: "center",
          //add space between cards
          gap: "1rem",
          alignItems: "center",
          alignContent: "center",
          marginTop: "5vh",
        }}
      >
        {props.offers.map((product) => (
          <Card
            key={product.id}
            style={{ width: "16rem", boxShadow: "0 0 10px rgba(0,0,0,0.5)" }}
          >
            <Card.Body>
              <Card.Title>{product.name}</Card.Title>
              <Card.Text>{product.description}</Card.Text>
              <Card.Text>{product.status}</Card.Text>
              <Button variant="danger" onClick={() => DeleteForum(product.id)}>
                Delete
              </Button>
              <Button variant="primary" onClick={() => handleClick(product.id)}>
                Update
              </Button>
            </Card.Body>
          </Card>
        ))}
      </div>
    </>
  );
}

export default Forums;
